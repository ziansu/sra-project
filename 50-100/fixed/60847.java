public LeaderboardsFragment.Star_icon_names getStarStatusOfUser(java.lang.String username) {
    com.ohiostate.chuckmyphone.chuckmyphone.LeaderboardsFragment.Star_icon_names iconName = LeaderboardsFragment.Star_icon_names.none;
    if ((dataSnapshot) != null) {
        for (com.firebase.client.DataSnapshot userSnapshot : dataSnapshot.child("users").getChildren()) {
            if (userSnapshot.child("username").getValue().equals(username)) {
                iconName = LeaderboardsFragment.Star_icon_names.valueOf(userSnapshot.child("starIconName").getValue().toString());
                break;
            }
        }
    }
    return iconName;
}
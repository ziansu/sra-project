@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot userSnap : dataSnapshot.getChildren()) {
        com.percepshunnn.voluntunity.leaderboardview.LeaderboardEntry user = userSnap.getValue(com.percepshunnn.voluntunity.leaderboardview.LeaderboardEntry.class);
        if ((java.lang.Long.parseLong(com.facebook.Profile.getCurrentProfile().getId())) == (user.getId())) {
            displayExtraDetails(user);
        }
    }
}
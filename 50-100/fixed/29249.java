@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    java.lang.String userIdentity = ("-" + (ser402team.weallcode.ChatAvailability.myUsername.toLowerCase())) + "-";
    for (com.firebase.client.DataSnapshot child : dataSnapshot.getChildren()) {
        java.lang.String key = child.getKey().toString();
        if (key.contains(userIdentity)) {
            java.lang.String friend = getFriendsName(key, ser402team.weallcode.ChatAvailability.myUsername);
            list.add(friend);
            adapter.notifyDataSetChanged();
        }
    }
}
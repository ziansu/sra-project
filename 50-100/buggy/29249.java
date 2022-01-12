@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    java.lang.String userIdentity = ("-" + (ser402team.weallcode.ChatAvailability.myUsername.toLowerCase())) + "-";
    for (com.firebase.client.DataSnapshot child : dataSnapshot.getChildren()) {
        if (child.getKey().toString().contains(userIdentity)) {
            java.lang.String friend = getFriendsName(child.getKey().toString());
            list.add(friend);
            adapter.notifyDataSetChanged();
        }
    }
}
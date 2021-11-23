@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    friendArrayList.clear();
    for (com.google.firebase.database.DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
        com.gabrielemaffoni.toastapp.to.Friend friend = postSnapshot.getValue(com.gabrielemaffoni.toastapp.to.Friend.class);
        friend.setUserId(postSnapshot.getKey());
        friendArrayList.add(friend);
    }
    com.gabrielemaffoni.toastapp.classes.FriendsAdapter adapter = new com.gabrielemaffoni.toastapp.classes.FriendsAdapter(getApplicationContext(), friendArrayList);
    setGridDesignData(grid, adapter);
}
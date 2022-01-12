private void setupFirebaseAndListener(java.lang.String channelId) {
    friendsRef = firebaseFactory.createFirebase(firebaseUrlFormatter.getUserFriendsUrl()).child(uidPref.get());
    friendValueEventListener = new com.citrix.wrekt.activity.ChannelMemberActivity.FriendValueEventListener();
    friendsRef.addValueEventListener(friendValueEventListener);
    channelMembersRef = firebaseFactory.createFirebase(firebaseUrlFormatter.getBaseUrl()).child("channelMembers");
    channelMemberChildEventListener = new com.citrix.wrekt.activity.ChannelMemberActivity.ChannelMemberChildEventListener();
    channelMembersRef.child(channelId).addChildEventListener(channelMemberChildEventListener);
}
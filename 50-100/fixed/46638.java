public com.ilibed.user.SimpleUser addToFriend(java.lang.Integer userId) {
    java.lang.Integer ownerId = getAuthId();
    if (ownerId == null) {
        return null;
    }
    com.ilibed.user.UserFriend userFriend = new com.ilibed.user.UserFriend();
    userFriend.setFriendId(userId);
    userFriend.setUserId(ownerId);
    userFriendRepository.save(userFriend);
    userFriend = new com.ilibed.user.UserFriend();
    userFriend.setUserId(userId);
    userFriend.setFriendId(ownerId);
    userFriendRepository.save(userFriend);
    return userRepository.findSimpleById(userId);
}
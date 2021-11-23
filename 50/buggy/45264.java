public static void setUsersFollowed(long followerId, long followedId, boolean isFollowed) {
    fr.ecp.sio.twitterAppEngine.model.User follower = fr.ecp.sio.twitterAppEngine.data.UsersRepository.getUser(followerId);
    fr.ecp.sio.twitterAppEngine.model.User followed = fr.ecp.sio.twitterAppEngine.data.UsersRepository.getUser(followedId);
}
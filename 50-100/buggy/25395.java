public java.util.Collection<fr.ippon.tatami.domain.User> getFollowersForUser(java.lang.String username) {
    java.lang.String login = this.getLoginFromUsername(username);
    java.util.Collection<java.lang.String> followersLogins = followerRepository.findFollowersForUser(login);
    java.util.Collection<fr.ippon.tatami.domain.User> followers = new java.util.ArrayList<fr.ippon.tatami.domain.User>();
    for (java.lang.String followerLogin : followersLogins) {
        fr.ippon.tatami.domain.User follower = userRepository.findOneByLogin(followerLogin).get();
        followers.add(follower);
    }
    return followers;
}
public boolean unfollowUser(java.lang.String usernameToUnfollow) {
    log.debug("Removing followed user : {}", usernameToUnfollow);
    fr.ippon.tatami.domain.User currentUser = userRepository.findOneByLogin(fr.ippon.tatami.security.SecurityUtils.getCurrentUser().getUsername()).get();
    java.lang.String loginToUnfollow = this.getLoginFromUsername(usernameToUnfollow);
    fr.ippon.tatami.domain.User userToUnfollow = userRepository.findOneByLogin(loginToUnfollow).get();
    return unfollowUser(currentUser, userToUnfollow);
}
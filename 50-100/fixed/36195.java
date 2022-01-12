public boolean unfollowUser(java.lang.String loginToUnfollow) {
    log.debug("Removing followed user : {}", loginToUnfollow);
    fr.ippon.tatami.domain.User currentUser = userRepository.findOneByLogin(fr.ippon.tatami.security.SecurityUtils.getCurrentUser().getUsername()).get();
    fr.ippon.tatami.domain.User userToUnfollow = userRepository.findOneByLogin(loginToUnfollow).get();
    return unfollowUser(currentUser, userToUnfollow);
}
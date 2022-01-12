public com.cnxs.bo.User logIn(com.cnxs.bo.User user) {
    com.cnxs.bo.User targetUser = userDao.findUserByAccount(user);
    if ((targetUser != null) && (bCryptEncoder.matches(user.getPassword(), targetUser.getPassword()))) {
        java.lang.String accessToken = jwtSrv.registerToken(targetUser.getId(), targetUser.isKeyUser());
        com.cnxs.common.UserInfoContextHolder.setUserInfo(user.getId(), user.isKeyUser(), accessToken);
        return targetUser;
    }
    return null;
}
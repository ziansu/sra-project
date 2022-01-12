public static void refreshUserToken(java.lang.String usertokenid, java.lang.String applicationTokenId, net.whydah.sso.user.types.UserToken refreshedUserToken) {
    net.whydah.sso.user.types.UserToken oldusertoken = net.whydah.token.user.ActiveUserTokenRepository.activeusertokensmap.remove(usertokenid);
    refreshedUserToken.setTokenid(usertokenid);
    net.whydah.token.user.ActiveUserTokenRepository.addUserToken(refreshedUserToken, applicationTokenId, "refresh");
}
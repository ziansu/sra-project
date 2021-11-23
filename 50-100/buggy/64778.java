public fr.ippon.tatami.domain.User getUserByUsername(java.lang.String username) {
    fr.ippon.tatami.domain.User currentUser = authenticationService.getCurrentUser();
    java.lang.String domain = fr.ippon.tatami.service.util.DomainUtil.getDomainFromLogin(currentUser.getLogin());
    java.lang.String login = "";
    if (fr.ippon.tatami.config.Constants.USER_AND_FRIENDS) {
        login = fr.ippon.tatami.service.util.DomainUtil.getLoginFromUsernameAndDomain(username, domain);
    }else {
        login = usernameService.getLoginFromUsernameAndDomain(username, domain);
    }
    return getUserByLogin(login);
}
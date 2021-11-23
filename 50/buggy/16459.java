@java.lang.Override
public void logout(final javax.servlet.http.HttpSession session) {
    helperService.postForObject(net.inpercima.runandfun.constants.RunkeeperApiConstants.DE_AUTHORIZATION_URL, ((java.lang.String) (session.getAttribute(net.inpercima.runandfun.constants.AppConstants.SESSION_ACCESS_TOKEN))));
    session.removeAttribute(net.inpercima.runandfun.constants.AppConstants.SESSION_ACCESS_TOKEN);
}
@java.lang.Override
public void logout(final javax.servlet.http.HttpSession session) {
    session.removeAttribute(net.inpercima.runandfun.constants.AppConstants.SESSION_ACCESS_TOKEN);
}
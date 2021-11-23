public static java.lang.String getRedirectionPath(final org.fenixedu.bennu.core.domain.User user, final javax.servlet.http.HttpServletRequest request) {
    synchronized(org.fenixedu.ulisboa.specifications.authentication.ULisboaAuthenticationRedirector.handlers) {
        for (final org.fenixedu.ulisboa.specifications.authentication.IULisboaRedirectionHandler iuLisboaRedirectionHandler : org.fenixedu.ulisboa.specifications.authentication.ULisboaAuthenticationRedirector.handlers) {
            if (iuLisboaRedirectionHandler.isToRedirect(user, request)) {
                return iuLisboaRedirectionHandler.redirectionPath(user, request);
            }
        }
    }
    return null;
}
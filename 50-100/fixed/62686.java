public static void unsetUserPrincipal(javax.servlet.http.HttpServletRequest request, boolean invalidateSession) {
    javax.servlet.http.HttpSession session = request.getSession(false);
    if (session != null) {
        java.security.Principal principal = it.lorenzoingrilli.icarus.impl.SessionPrincipalResolver._getUserPrincipal(request);
        if (principal != null) {
            it.lorenzoingrilli.icarus.impl.SessionPrincipalResolver.logger.debug(("Unset principal " + (principal.getName())));
            session.removeAttribute(it.lorenzoingrilli.icarus.impl.SessionPrincipalResolver.PRINCIPAL_SESSION_ATTRIBUTE);
        }
        if (invalidateSession) {
            session.invalidate();
        }
    }
}
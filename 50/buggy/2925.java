@java.lang.Override
public void logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.Authentication authentication) {
    de.fred4jupiter.fredbet.service.SessionTrackingLogoutHandler.LOG.info("user with name {} has logged out", authentication.getName());
    sessionTrackingService.registerLogout(authentication.getName());
}
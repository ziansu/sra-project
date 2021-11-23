private boolean checkFormLogin(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.FilterChain filterChain) throws java.io.IOException, javax.servlet.ServletException {
    org.springframework.security.core.context.SecurityContext sc = securityContextRepository.loadContext(new org.springframework.security.web.context.HttpRequestResponseHolder(request, response));
    if ((sc != null) && ((sc.getAuthentication()) != null)) {
        logger.debug("User already logged in - chaining");
        org.springframework.security.core.context.SecurityContextHolder.getContextHolderStrategy().setContext(sc);
        filterChain.doFilter(request, response);
        return true;
    }
    return false;
}
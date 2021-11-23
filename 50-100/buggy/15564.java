public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    if ((request.getServerPort()) == 443) {
        java.util.regex.Matcher m = domainPattern.matcher(request.getServerName());
        if ((m.matches()) == false) {
            ((javax.servlet.http.HttpServletResponse) (response)).setHeader("Strict-Transport-Security", "max-age=31622400");
        }
    }
    chain.doFilter(request, response);
}
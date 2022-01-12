public void doFilter(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest httpRequest = ((javax.servlet.http.HttpServletRequest) (request));
    if ((httpRequest.getSession().getAttribute(Parameters.USER)) == null) {
        ua.com.jurimik.filter.AuthentificationFilter.LOG.warn("Unauthorized user");
        request.setAttribute(Parameters.ERROR, Messages.AUTORIZED_ERROR_ACCESS);
        request.getRequestDispatcher("/LoginController").forward(request, response);
    }else {
        ua.com.jurimik.filter.AuthentificationFilter.LOG.debug("User is authorized");
        chain.doFilter(request, response);
    }
}
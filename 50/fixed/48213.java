public void init(javax.servlet.FilterConfig filterConfig) throws javax.servlet.ServletException {
    expirationTime = java.lang.Integer.parseInt(filterConfig.getInitParameter("expirationTime"));
}
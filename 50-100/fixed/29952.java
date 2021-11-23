@java.lang.Override
protected void doFilter(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, javax.servlet.FilterChain chain) throws java.lang.Exception {
    if ("*/*".equals(request.getHeader("accept"))) {
        fr.ippon.tatami.web.filter.IeRefreshWrapper requestIE = new fr.ippon.tatami.web.filter.IeRefreshWrapper(request);
        chain.doFilter(requestIE, response);
    }else {
        chain.doFilter(request, response);
    }
}
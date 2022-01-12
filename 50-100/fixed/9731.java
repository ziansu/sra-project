@java.lang.Override
public void doFilter(com.cdi.crud.infra.filter.ServletRequest req, com.cdi.crud.infra.filter.ServletResponse resp, com.cdi.crud.infra.filter.FilterChain chain) throws com.cdi.crud.infra.filter.ServletException, java.io.IOException {
    req.setCharacterEncoding("UTF-8");
    resp.setCharacterEncoding("UTF-8");
    javax.servlet.http.HttpServletResponse httpResp = ((javax.servlet.http.HttpServletResponse) (resp));
    requestHolder.get().setCurrentRequest(((javax.servlet.http.HttpServletRequest) (req)));
    httpResp.setHeader("X-UA-Compatible", "IE=Edge");
    chain.doFilter(req, resp);
}
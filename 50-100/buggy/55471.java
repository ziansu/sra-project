@java.lang.Override
protected void service(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    if (null != (subRouter)) {
        if (subRouter.route(new com.rockson.servletplus.Request(req), new com.rockson.servletplus.Response(res))) {
            return ;
        }
    }
    verb(req.getMethod(), new com.rockson.servletplus.Request(req), new com.rockson.servletplus.Response(res));
}
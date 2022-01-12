@java.lang.Override
protected void doPut(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    put(new com.rockson.servletplus.Request(req, this), new com.rockson.servletplus.Response(res, this));
}
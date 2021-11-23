protected void verb(java.lang.String method, com.rockson.servletplus.Request req, com.rockson.servletplus.Response res) throws java.io.IOException, javax.servlet.ServletException {
    if (req.getPathInfo().endsWith(".jsp")) {
        getServletContext().getNamedDispatcher("jsp").forward(req, res);
    }else {
        getServletContext().getNamedDispatcher("default").forward(req, res);
    }
}
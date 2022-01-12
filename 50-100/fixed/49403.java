public static void redirect(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, java.lang.String pageKey) throws java.io.IOException {
    java.lang.String path = pageKey;
    if ("home".equals(path)) {
        by.training.nc.dev5.entity.Person user = ((by.training.nc.dev5.entity.Person) (request.getSession().getAttribute("user")));
        path = by.training.nc.dev5.web.routing.Router.resolveHome(user);
    }
    if (path.startsWith("path.page.")) {
        path = by.training.nc.dev5.web.routing.Router.resolvePath(path);
    }
    response.sendRedirect(path);
}
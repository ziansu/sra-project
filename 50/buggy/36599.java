@java.lang.Override
public void onStartup(javax.servlet.ServletContext servletContext) throws javax.servlet.ServletException {
    super.onStartup(servletContext);
    getServletFilters(servletContext);
    servletContext.setInitParameter("defaultHtmlEscape", "true");
}
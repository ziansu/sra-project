@java.lang.Override
public void onStartup(javax.servlet.ServletContext servletContext) throws javax.servlet.ServletException {
    super.onStartup(servletContext);
    servletContext.setInitParameter("defaultHtmlEscape", "true");
}
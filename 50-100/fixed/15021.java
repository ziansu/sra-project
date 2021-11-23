@java.lang.Override
protected void doGet(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    final java.io.Writer writer = response.getWriter();
    com.nov.isrv.widget.MasterTheme thisTheme = new com.nov.isrv.widget.MasterTheme();
    thisTheme.addScript("lib/user.js");
    thisTheme.setContent(this.content());
    writer.write(thisTheme.getMaster().get());
}
@java.lang.Override
protected void doGet(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse reponse) throws java.io.IOException, javax.servlet.ServletException {
    final java.io.Writer writer = reponse.getWriter();
    com.nov.isrv.widget.MasterTheme thisTheme = new com.nov.isrv.widget.MasterTheme();
    thisTheme.addScript("lib/user.js");
    thisTheme.setBluePrintBackground();
    thisTheme.setContent(this.content());
    writer.write(thisTheme.getMaster().get());
}
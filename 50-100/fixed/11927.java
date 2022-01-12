private java.lang.StringBuilder buildHtmlHeadLink() {
    final java.lang.StringBuilder html = new java.lang.StringBuilder();
    html.append("<link rel=\"stylesheet\" href=\"/css/bootstrap.min.css\" />").append(NewLine.CRLF);
    html.append("<link rel=\"stylesheet\" href=\"/css/bootstrap-theme.min.css\" />").append(NewLine.CRLF);
    html.append("<link rel=\"stylesheet\" href=\"/css/routerlogger.css\" />").append(NewLine.CRLF);
    html.append("<link rel=\"stylesheet\" href=\"/fonts/fonts.css\" />").append(NewLine.CRLF);
    return html;
}
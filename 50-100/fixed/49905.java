private java.lang.StringBuilder buildHtmlHeadTitle(final java.lang.String title) {
    final java.lang.StringBuilder html = new java.lang.StringBuilder("<title>");
    if ((title != null) && (!(title.trim().isEmpty()))) {
        html.append(title.trim()).append(" - ");
    }
    html.append(it.albertus.httpserver.html.HtmlUtils.escapeHtml(it.albertus.router.resources.Messages.get("msg.application.name"))).append("</title>").append(NewLine.CRLF);
    return html;
}
private java.lang.StringBuilder getHtmlBody() {
    java.lang.StringBuilder html = new java.lang.StringBuilder();
    html.append("<tbody>");
    for (com.github.dandelion.datatables.core.html.HtmlRow row : this.body) {
        html.append(row.toHtml());
    }
    html.append("</tbody>");
    return html;
}
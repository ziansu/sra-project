private java.lang.StringBuilder buildHtmlHead(final java.lang.String title) {
    final java.lang.StringBuilder html = new java.lang.StringBuilder("<head>").append(NewLine.CRLF);
    html.append(buildHtmlHeadMeta());
    html.append(buildHtmlHeadLink());
    html.append(buildHtmlHeadScript());
    html.append(buildHtmlHeadTitle(title));
    html.append("</head>").append(NewLine.CRLF);
    return html;
}
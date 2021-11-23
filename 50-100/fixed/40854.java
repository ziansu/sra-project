private java.lang.StringBuilder buildHtmlHeadMeta() {
    final java.lang.StringBuilder html = new java.lang.StringBuilder();
    html.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />").append(NewLine.CRLF);
    html.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=").append(getCharset().name().toLowerCase()).append("\" />").append(NewLine.CRLF);
    html.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />").append(NewLine.CRLF);
    return html;
}
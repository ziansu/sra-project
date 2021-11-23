private java.lang.String removeHtmlTags(java.lang.String html) {
    html = html.replaceAll("</p>", " ").replaceAll("<p>", "").replaceAll("<br data-mce-bogus=\"1\">", "").replaceAll("<br>", "").replaceAll("</br>", "").replaceAll("<p class=\"p1\">", "");
    return html;
}
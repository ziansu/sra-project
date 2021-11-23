private java.lang.String generateLink(java.lang.String tag) {
    java.lang.String link = ((("<a href=\"" + (tag.toLowerCase())) + ".html\">") + tag) + "</a>";
    return link;
}
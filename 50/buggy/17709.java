private java.lang.String parseHrefToLink(java.lang.String s) {
    return s.substring(s.indexOf('"'), s.lastIndexOf('"'));
}
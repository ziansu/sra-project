private java.io.ByteArrayOutputStream cleanHtml(java.io.InputStream html) {
    org.w3c.tidy.Tidy tidy = new org.w3c.tidy.Tidy();
    tidy.setWraplen(java.lang.Integer.MAX_VALUE);
    tidy.setDropEmptyParas(true);
    tidy.setCharEncoding(org.w3c.tidy.Configuration.UTF8);
    tidy.setXHTML(true);
    tidy.setShowWarnings(false);
    tidy.setQuiet(true);
    tidy.setMakeClean(true);
    tidy.setTidyMark(false);
    tidy.setHideEndTags(false);
    java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
    tidy.parseDOM(html, outputStream);
    return outputStream;
}
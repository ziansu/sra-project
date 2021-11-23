private java.lang.String getXml(java.io.Writer sw) {
    java.lang.String all = sw.toString();
    int first = all.indexOf("\n");
    int last = all.lastIndexOf("\n");
    return all.substring((first + 1), last).trim();
}
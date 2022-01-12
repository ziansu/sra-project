private java.lang.String getXml(java.io.Writer sw) {
    java.lang.String all = sw.toString();
    int first = all.indexOf("\n");
    int last = all.lastIndexOf("\n");
    java.lang.System.out.println(all);
    all = all.substring((first + 1), last).trim();
    return all;
}
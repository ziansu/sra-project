public java.util.Date GetModifiedDate(java.lang.String url) {
    java.util.List<com.github.sardine.DavResource> l = null;
    try {
        l = sardine.list(url);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    java.util.Date d = l.get(0).getModified();
    java.lang.System.out.println(("date is " + d));
    return d;
}
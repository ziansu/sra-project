public <P extends org.runwb.lib.selen.Selen.Page> P bindPage(java.lang.Class<P> pageCls, java.lang.String url) {
    P p = org.runwb.lib.selen.Selen.newPage(pageCls, this, url);
    pages.put(pageCls, p);
    return p;
}
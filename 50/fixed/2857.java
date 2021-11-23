public void bindPage(java.lang.Class<? extends org.runwb.lib.selen.Selen.Page> pageCls, java.lang.String url) {
    bindPage(org.runwb.lib.selen.Selen.newPage(pageCls, this, url));
}
public java.lang.String show() throws java.io.UnsupportedEncodingException {
    java.net.URLDecoder.decode(this.catalog, "utf-8");
    items = userMgr.getGoodsByCatalog(this.catalog);
    com.ian.onlinemall.controller.LOG.info("Customer visit catalog page.");
    return "catalog";
}
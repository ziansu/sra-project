public java.lang.String show() throws java.io.UnsupportedEncodingException {
    java.net.URLDecoder.decode(id, "utf-8");
    items = userMgr.getGoodsByCatalog(this.id);
    com.ian.onlinemall.controller.LOG.info("Customer visit catalog page.");
    return "catalog";
}
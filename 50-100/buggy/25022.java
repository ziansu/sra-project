private static final void INIT_PAGE_CONFIG(final org.json.JSONObject pageConfig) {
    com.zjh.tears.config.Config.DEFAULT_INDEX = pageConfig.getString("defaultIndex");
    for (java.lang.Object obj : pageConfig.getJSONArray("errorPages")) {
        org.json.JSONObject errorPage = ((org.json.JSONObject) (obj));
        com.zjh.tears.config.Config.ERR_PAGES.put(errorPage.getInt("code"), errorPage.getString("page"));
    }
}
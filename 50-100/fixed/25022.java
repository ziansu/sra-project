private static final void INIT_PAGE_CONFIG(final org.json.JSONObject pageConfig) {
    for (java.lang.Object obj : pageConfig.getJSONArray("defaultIndex")) {
        java.lang.String index = ((java.lang.String) (obj));
        com.zjh.tears.config.Config.DEFAULT_INDEX.add(index);
    }
    for (java.lang.Object obj : pageConfig.getJSONArray("errorPages")) {
        org.json.JSONObject errorPage = ((org.json.JSONObject) (obj));
        com.zjh.tears.config.Config.ERR_PAGES.put(errorPage.getInt("code"), errorPage.getString("page"));
    }
}
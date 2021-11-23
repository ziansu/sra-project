private static synchronized com.sunhz.projectutils.jsonutils.JsonUtils getInstance() {
    if (((com.sunhz.projectutils.jsonutils.JsonUtils.jsonUtils) == null) || ((com.sunhz.projectutils.jsonutils.JsonUtils.gson) == null)) {
        com.sunhz.projectutils.jsonutils.JsonUtils.jsonUtils = new com.sunhz.projectutils.jsonutils.JsonUtils();
        com.sunhz.projectutils.jsonutils.JsonUtils.gson = new com.google.gson.Gson();
    }
    return com.sunhz.projectutils.jsonutils.JsonUtils.jsonUtils;
}
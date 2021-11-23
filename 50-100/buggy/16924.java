private void renderPage(com.taobao.weex.WXSDKInstance mInstance, java.lang.String packageName, java.lang.String template, java.lang.String source, java.lang.String jsonInitData) {
    java.util.Map<java.lang.String, java.lang.Object> options = new java.util.HashMap<>();
    options.put(WXSDKInstance.BUNDLE_URL, source);
    mInstance.render(packageName, template, options, jsonInitData, com.taobao.weex.utils.WXViewUtils.getScreenWidth(this), com.taobao.weex.utils.WXViewUtils.getScreenHeight(this), WXRenderStrategy.APPEND_ASYNC);
}
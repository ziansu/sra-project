public static void switchWebViewContext(android.content.Context pluginActivity) {
    com.limpoxe.fairy.util.LogUtil.d("尝试切换WebView Context, 不同的WebView内核, 实现方式可能不同, 本方法基于Chrome的WebView实现");
    try {
        android.webkit.WebView wb = new android.webkit.WebView(pluginActivity);
        wb.loadUrl("");
    } catch (java.lang.NullPointerException e) {
        e.printStackTrace();
        com.limpoxe.fairy.util.LogUtil.e("插件Application对象尚未初始化会触发NPE，如果是异步初始化插件，应等待异步初始化完成再进入插件");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}
public java.lang.String savePerformance(@android.support.annotation.NonNull
com.taobao.weex.WXSDKInstance instance) {
    java.lang.String pageName = null;
    com.taobao.weex.analyzer.core.Performance performance = com.taobao.weex.analyzer.core.PerformanceMonitor.monitor(instance);
    if (performance != null) {
        pageName = com.taobao.weex.analyzer.core.WXPerfStorage.fetchPageName(instance, performance);
        put(pageName, performance);
    }
    return pageName;
}
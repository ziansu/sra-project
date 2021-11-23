public static void reset() {
    com.netflix.hystrix.collapser.RequestCollapserFactory.globalScopedCollapsers.clear();
    com.netflix.hystrix.collapser.RequestCollapserFactory.requestScopedCollapsers.clear();
    com.netflix.hystrix.util.HystrixTimer.reset();
}
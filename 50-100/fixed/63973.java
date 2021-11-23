@java.lang.Override
public void onStartup(com.sbk.config.ServletContext servletContext) throws com.sbk.config.ServletException {
    super.onStartup(servletContext);
    java.util.EnumSet<com.sbk.config.DispatcherType> dispatcherTypes = java.util.EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);
    com.sbk.config.FilterRegistration.Dynamic urlReWrite = servletContext.addFilter(com.sbk.config.WebAppInitializer.URL_REWRITE_FILTER_NAME, new org.tuckey.web.filters.urlrewrite.UrlRewriteFilter());
    urlReWrite.addMappingForUrlPatterns(dispatcherTypes, true, com.sbk.config.WebAppInitializer.URL_REWRITE_FILTER_MAPPING);
}
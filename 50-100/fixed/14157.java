public java.lang.String transform(java.lang.String transformerName, java.lang.String url, boolean cache) throws org.craftercms.core.exception.UrlTransformationException {
    org.craftercms.engine.service.context.SiteContext context = org.craftercms.engine.service.context.SiteContext.getCurrent();
    if (context != null) {
        org.craftercms.core.service.CachingOptions cachingOptions = new org.craftercms.core.service.CachingOptions();
        cachingOptions.setDoCaching(cache);
        return context.getUrlTransformationEngine().transformUrl(context.getContext(), cachingOptions, transformerName, url);
    }else {
        return url;
    }
}
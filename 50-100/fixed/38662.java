protected void unbindHttpCacheHandlingRule(final com.adobe.acs.commons.httpcache.rule.HttpCacheHandlingRule cacheHandlingRule, final java.util.Map<java.lang.String, java.lang.Object> configs) {
    java.lang.String servicePid = org.apache.sling.commons.osgi.PropertiesUtil.toString(configs.get("service.pid"), StringUtils.EMPTY);
    if ((com.adobe.acs.commons.httpcache.engine.impl.HttpCacheEngineImpl.cacheHandlingRules.remove(servicePid)) != null) {
        com.adobe.acs.commons.httpcache.engine.impl.HttpCacheEngineImpl.log.debug("Cache handling rule removed - {}.", cacheHandlingRule.getClass().getName());
        com.adobe.acs.commons.httpcache.engine.impl.HttpCacheEngineImpl.log.debug("Total number of cache handling rules available after removal: {}", com.adobe.acs.commons.httpcache.engine.impl.HttpCacheEngineImpl.cacheHandlingRules.size());
    }
}
private java.lang.String retrieveSite() {
    java.lang.String siteName = com.aperto.magnolia.vanity.VanityUrlService.DEF_SITE;
    if (_moduleRegistry.get().isModuleRegistered("multisite")) {
        info.magnolia.module.site.Site site = ((info.magnolia.module.site.ExtendedAggregationState) (info.magnolia.context.MgnlContext.getAggregationState())).getSite();
        siteName = site.getName();
    }
    return siteName;
}
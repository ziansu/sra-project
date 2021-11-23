public java.lang.Void doWork() throws java.lang.Exception {
    long siteSize = getNodeSize(siteRef);
    java.util.Date now = new java.util.Date();
    java.lang.String siteName = ((java.lang.String) (getNodeService().getProperty(siteRef, ContentModel.PROP_NAME)));
    org.alfresco.museum.ucm.sizelimits.SiteSizeUpdaterFactory.LOGGER.info(java.lang.String.format("Site %s have content of size %d on %s", siteName, siteSize, now.toString()));
    setSiteSize(siteRef, siteSize, false, true);
    getNodeService().setProperty(siteRef, UCMConstants.ASPECT_PROP_SITE_SCAN_DATE_QNAME, now);
    return null;
}
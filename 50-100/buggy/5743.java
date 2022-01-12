public static com.ustadmobile.core.controller.CatalogController makeControllerByURL(java.lang.String url, com.ustadmobile.core.impl.UstadMobileSystemImpl impl, int resourceMode, java.lang.String httpUser, java.lang.String httpPassword, int flags, java.lang.Object context) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    com.ustadmobile.core.opds.UstadJSOPDSFeed opdsFeed = com.ustadmobile.core.controller.CatalogController.getCatalogByURL(url, resourceMode, httpUser, httpPassword, flags, context);
    com.ustadmobile.core.controller.CatalogController result = new com.ustadmobile.core.controller.CatalogController(new com.ustadmobile.core.model.CatalogModel(opdsFeed), context);
    result.setResourceMode(resourceMode);
    return result;
}
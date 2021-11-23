public static com.ustadmobile.core.controller.CatalogController makeUserCatalog(com.ustadmobile.core.impl.UstadMobileSystemImpl impl, java.lang.Object context) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    java.lang.String opdsServerURL = impl.getUserPref("opds_server_primary", UstadMobileDefaults.DEFAULT_OPDS_SERVER, context);
    java.lang.String activeUser = impl.getActiveUser(context);
    java.lang.String activeUserAuth = impl.getActiveUserAuth(context);
    return com.ustadmobile.core.controller.CatalogController.makeControllerByURL(opdsServerURL, com.ustadmobile.core.controller.CatalogController.USER_RESOURCE, activeUser, activeUserAuth, com.ustadmobile.core.controller.CatalogController.CACHE_ENABLED, context);
}
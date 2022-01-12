public void loadCatalog(java.lang.String url, int resourceMode) {
    final com.ustadmobile.core.impl.UstadMobileSystemImpl impl = com.ustadmobile.core.impl.UstadMobileSystemImpl.getInstance();
    final int fetchFlags = com.ustadmobile.core.controller.CatalogController.CACHE_ENABLED;
    com.ustadmobile.core.controller.CatalogController.makeControllerForView(this, url, resourceMode, fetchFlags, this);
}
public void onAppStop(com.wowza.wms.application.IApplicationInstance appInstance) {
    try {
        if ((transferManager) != null) {
            transferManager.shutdownNow(false);
        }
    } catch (java.lang.Exception e) {
        logger.error((((((com.wowza.wms.plugin.s3upload.ModuleS3Upload.MODULE_NAME) + ".onAppStop [") + (appInstance.getContextStr())) + "] exception: ") + (e.getMessage())), e);
    }
}
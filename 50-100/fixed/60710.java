private void preparingAdminConfigCache() throws java.lang.Exception {
    com.superwebsitebuilder.platform.listener.InitSuperWebSiteApplicatLevelListener.logger.debug("InitSuperWebSiteApplicatLevelListener --> preparingAdminConfigCache()");
    java.util.Map<java.lang.String, java.lang.Object> adminConfigMap = cacheFactory.getMapByKey(CacheFactory.ADMIN_CONFIG_MAP);
    java.util.List<com.superwebsitebuilder.applicationLevel.data.websitefunction.SensitiveWordData> allSWData = daoFacade.getAllSensitiveWordsList();
    if ((com.superwebsitebuilder.espider.util.Utils.checkNotNull(adminConfigMap)) && (com.superwebsitebuilder.espider.util.Utils.checkNotNull(allSWData))) {
        acManager.setSensitiveWords(allSWData);
        adminConfigMap.put(CacheFactory.ADMIN_CONFIG_SERVER_MAP, acManager);
    }
}
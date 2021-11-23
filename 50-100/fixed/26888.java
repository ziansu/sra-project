public static int isInstalled(java.lang.String appName) throws java.lang.Exception {
    int installed = 0;
    if ((((controllers.MarketPlaceApps.hwToAppStatusMap.get("Cvt-QJ3")) != null) && (controllers.MarketPlaceApps.hwToAppStatusMap.get("Cvt-QJ3").containsKey(appName))) && ((controllers.MarketPlaceApps.hwToAppStatusMap.get("Cvt-QJ3").get(appName)) > 0)) {
        installed = 1;
    }
    return installed;
}
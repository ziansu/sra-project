private void calculateApps(java.util.List<com.itheima.mobilesafe.utils.objects.AppInfo> appInfos) {
    for (com.itheima.mobilesafe.utils.objects.AppInfo appInfo : appInfos) {
        if (appInfo.isUserApp())
            (userAppsCount)++;
        else
            (sysAppsCount)++;
        
    }
}
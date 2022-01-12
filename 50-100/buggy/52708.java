public static void fixUid(android.content.pm.ApplicationInfo applicationInfo) {
    if ((com.lody.virtual.client.VClientImpl.getClient().isBound()) && (applicationInfo != null)) {
        java.lang.String packageName = applicationInfo.packageName;
        if ((packageName.equals(com.lody.virtual.client.VClientImpl.getClient().geCurrentPackage())) || (com.lody.virtual.helper.utils.ComponentUtils.isSharedPackage(packageName))) {
            applicationInfo.uid = java.lang.Process.myUid();
        }else {
            applicationInfo.uid = 99999;
        }
    }
}
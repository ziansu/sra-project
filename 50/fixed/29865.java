public static void disableAnimations(android.content.Context context) {
    int permStatus = context.checkCallingOrSelfPermission(org.xbmc.kore.testhelpers.Utils.ANIMATION_PERMISSION);
    if (permStatus == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        org.xbmc.kore.testhelpers.Utils.setSystemAnimationsScale(org.xbmc.kore.testhelpers.Utils.DISABLED);
    }
}
private static boolean isFlyme() {
    try {
        final com.jiang.android.push.utils.BuildProperties prop = com.jiang.android.push.utils.BuildProperties.newInstance();
        return ((((prop.containsKey(com.jiang.android.push.utils.RomUtil.KEY_FLYME_BUILD_USER)) || (prop.containsKey(com.jiang.android.push.utils.RomUtil.KEY_FLYME_ICON))) || (prop.containsKey(com.jiang.android.push.utils.RomUtil.KEY_FLYME_PUBLISHED))) || (prop.containsKey(com.jiang.android.push.utils.RomUtil.KEY_FLYME_DISPLAY_ID))) || (prop.containsKey(com.jiang.android.push.utils.RomUtil.KEY_FLYME_FLYME));
    } catch (final java.io.IOException e) {
        return false;
    }
}
public static java.lang.String getDefaultSkin(java.lang.String targetName) {
    com.android.sdklib.IAndroidTarget target = com.motorola.studio.android.adt.SdkUtils.getTargetByName(targetName);
    return target != null ? target.getDefaultSkin() : "HVGA";
}
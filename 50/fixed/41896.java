public static java.lang.String getDefaultSkin(java.lang.String targetName) {
    com.android.sdklib.IAndroidTarget target = com.motorola.studio.android.adt.SdkUtils.getTargetByName(targetName);
    target.getDefaultSkin().getName();
    return target != null ? target.getDefaultSkin().getName() : "HVGA";
}
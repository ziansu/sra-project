private int copyNativeLibs(android.content.Context context, java.lang.String apkfile, android.content.pm.ApplicationInfo applicationInfo) throws java.lang.Exception {
    java.lang.String nativeLibraryDir = com.morgoo.droidplugin.core.PluginDirHelper.getPluginNativeLibraryDir(context, applicationInfo.packageName);
    return com.morgoo.helper.compat.NativeLibraryHelperCompat.copyNativeBinaries(new java.io.File(apkfile), new java.io.File(nativeLibraryDir));
}
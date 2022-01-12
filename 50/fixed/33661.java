public static java.lang.String restoreRedirectedPath(java.lang.String origPath) {
    try {
        return com.lody.virtual.IOHook.nativeRestoreRedirectedPath(origPath);
    } catch (java.lang.Throwable e) {
        com.lody.virtual.helper.utils.VLog.e(com.lody.virtual.IOHook.TAG, com.lody.virtual.helper.utils.VLog.getStackTraceString(e));
    }
    return origPath;
}
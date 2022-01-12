public android.content.pm.PackageInfo getPackageInfo() {
    if ((pi) == null) {
        try {
            android.content.Context c = getContext();
            if (c != null) {
                pi = c.getPackageManager().getPackageInfo(c.getPackageName(), 0);
            }
        } catch (java.lang.Exception e) {
            com.jstakun.gms.android.utils.LoggerUtils.error(e.getMessage(), e);
        }
    }
    return pi;
}
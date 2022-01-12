public java.lang.String getApplicationVersionName() {
    java.lang.String devBuild = (BuildConfig.DEBUG) ? "d" : "";
    try {
        return (this.getPackageManager().getPackageInfo(getPackageName(), 0).versionName) + devBuild;
    } catch (android.content.pm.PackageManager e) {
        throw new java.lang.RuntimeException(e.getMessage());
    }
}
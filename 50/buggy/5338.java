public final java.lang.String getStore() {
    java.lang.String result = null;
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.CUPCAKE)) {
        result = context.getPackageManager().getInstallerPackageName(context.getPackageName());
    }
    return github.nisrulz.easydeviceinfo.base.CheckValidityUtil.checkValidData(result);
}
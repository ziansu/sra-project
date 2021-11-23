public final java.lang.String getStore() {
    java.lang.String result = context.getPackageManager().getInstallerPackageName(context.getPackageName());
    return github.nisrulz.easydeviceinfo.base.CheckValidityUtil.checkValidData(result);
}
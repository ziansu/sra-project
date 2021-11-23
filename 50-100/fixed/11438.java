private void initBugly() {
    com.tencent.bugly.beta.Beta.initDelay = 5 * 1000;
    com.tencent.bugly.beta.Beta.enableHotfix = false;
    Beta.canShowUpgradeActs.add(com.thirtydegreesray.openhub.ui.activity.LoginActivity.class);
    Beta.canShowUpgradeActs.add(com.thirtydegreesray.openhub.ui.activity.MainActivity.class);
    Beta.canShowUpgradeActs.add(com.thirtydegreesray.openhub.ui.activity.AboutActivity.class);
    com.tencent.bugly.beta.Beta.upgradeListener = com.thirtydegreesray.openhub.ui.widget.UpgradeDialog.INSTANCE;
    com.tencent.bugly.crashreport.CrashReport.UserStrategy strategy = new com.tencent.bugly.crashreport.CrashReport.UserStrategy(getApplicationContext());
    strategy.setAppVersion(BuildConfig.VERSION_NAME);
    strategy.setAppReportDelay((10 * 1000));
    com.tencent.bugly.Bugly.init(getApplicationContext(), AppConfig.BUGLY_APPID, BuildConfig.DEBUG);
    com.tencent.bugly.crashreport.CrashReport.setIsDevelopmentDevice(getApplicationContext(), BuildConfig.DEBUG);
}
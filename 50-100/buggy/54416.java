public com.benny.openlauncher.util.AppManager.App findApp(com.benny.openlauncher.model.Item item) {
    java.lang.String packageName = item.appIntent.getComponent().getPackageName();
    java.lang.String className = item.appIntent.getComponent().getClassName();
    for (com.benny.openlauncher.util.AppManager.App app : apps) {
        if ((app.className.equals(className)) && (app.packageName.equals(packageName))) {
            return app;
        }
    }
    return null;
}
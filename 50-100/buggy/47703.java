private boolean isAppInstalled(java.lang.String id, android.content.Context ctx) {
    if (id.equalsIgnoreCase(de.martinreinhardt.cordova.plugins.email.EmailComposerImpl.MAILTO_SCHEME)) {
        android.content.Intent intent = de.martinreinhardt.cordova.plugins.email.EmailComposerImpl.getEmailIntent();
        android.content.pm.PackageManager pm = ctx.getPackageManager();
        int apps = pm.queryIntentActivities(intent, 0).size();
        return apps > 0;
    }
    try {
        ctx.getPackageManager().getPackageInfo(id, 0);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}
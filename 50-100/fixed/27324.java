private java.lang.Object fixBoundApp(com.lody.virtual.client.VClientImpl.AppBindData data) {
    java.lang.Object thread = com.lody.virtual.client.core.VirtualCore.mainThread();
    java.lang.Object boundApp = mirror.android.app.ActivityThread.mBoundApplication.get(thread);
    mirror.android.app.ActivityThread.AppBindData.appInfo.set(boundApp, data.appInfo);
    mirror.android.app.ActivityThread.AppBindData.processName.set(boundApp, data.processName);
    mirror.android.app.ActivityThread.AppBindData.instrumentationName.set(boundApp, new android.content.ComponentName(data.appInfo.packageName, android.app.Instrumentation.class.getName()));
    return boundApp;
}
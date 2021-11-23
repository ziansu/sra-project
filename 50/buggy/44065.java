@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    android.util.Log.d(acr.browser.lightning.app.BrowserApp.TAG, "Cleaning up after the Android framework");
    acr.browser.lightning.utils.MemoryLeakUtils.clearNextServedView(this);
}
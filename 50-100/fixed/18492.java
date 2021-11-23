@java.lang.Override
public void run() {
    gvrLayout = new com.google.vr.ndk.base.GvrLayout(activity);
    if (gvrLayout.setAsyncReprojectionEnabled(true)) {
        com.google.vr.ndk.base.AndroidCompat.setSustainedPerformanceMode(activity, true);
    }
    gvrLayout.setPresentationView(new android.view.View(activity));
    com.google.vr.ndk.base.AndroidCompat.setVrModeEnabled(activity, true);
    synchronized(this) {
        this.notify();
    }
}
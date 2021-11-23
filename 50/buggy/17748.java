private void initializeLeakDetection() {
    if (android.support.compat.BuildConfig.DEBUG) {
        com.squareup.leakcanary.LeakCanary.install(this);
    }
}
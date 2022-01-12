@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    com.novoda.notils.logger.simple.Log.SHOW_LOGS = BuildConfig.DEBUG;
    com.novoda.notils.logger.simple.Log.TAG = com.malmstein.yahnac.HNewsApplication.LOG_TAG;
    com.novoda.notils.logger.simple.Log.STACK_DEPTH = 6;
    com.malmstein.yahnac.StrictModeManager.initializeStrictMode(com.malmstein.yahnac.HNewsApplication.newVmPolicyBuilder(), com.malmstein.yahnac.HNewsApplication.newThreadPolicyBuilder());
    if (BuildConfig.ENABLE_USAGE_ANALYTICS) {
        com.malmstein.yahnac.injection.Inject.usageAnalytics().initTracker(getApplicationContext());
    }
    return null;
}
private void initializeLogging() {
    com.google.android.gms.fit.samples.common.logger.LogWrapper logWrapper = new com.google.android.gms.fit.samples.common.logger.LogWrapper();
    com.google.android.gms.fit.samples.common.logger.Log.setLogNode(logWrapper);
    com.google.android.gms.fit.samples.common.logger.MessageOnlyLogFilter msgFilter = new com.google.android.gms.fit.samples.common.logger.MessageOnlyLogFilter();
    logWrapper.setNext(msgFilter);
    com.google.android.gms.fit.samples.common.logger.LogView logView = ((com.google.android.gms.fit.samples.common.logger.LogView) (findViewById(R.id.sample_logview)));
    logView.setTextAppearance(this, R.style.Log);
    logView.setBackgroundColor(Color.WHITE);
    msgFilter.setNext(logView);
    com.google.android.gms.fit.samples.common.logger.Log.i(com.google.android.gms.fit.samples.basichistoryapi.MainActivity.TAG, "Ready");
}
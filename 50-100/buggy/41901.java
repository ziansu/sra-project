public void setMinutsToDelayTimerCheckIfSubjectActiv() {
    android.util.Log.d(TAG, "setMinutsToDelayTimerCheckIfSubjectActiv: ");
    java.util.Calendar cal = java.util.Calendar.getInstance();
    int millisekToDelay = 20;
    android.os.Handler handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        public void run() {
            android.util.Log.d(TAG, "run: kör första check If aktiv");
            checkIfSubjectActiv();
        }
    }, millisekToDelay);
}
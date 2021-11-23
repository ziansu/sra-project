public void setMinutsToDelayTimerCheckIfSubjectActiv() {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    int millisekToDelay = 20;
    android.os.Handler handler = new android.os.Handler();
    handler.postDelayed(new java.lang.Runnable() {
        public void run() {
            checkIfSubjectActiv();
        }
    }, millisekToDelay);
}
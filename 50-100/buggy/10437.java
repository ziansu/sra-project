public void startFailureMode() {
    android.util.Log.d("BROWSERTESTING", (("failuremode: checking if network is online before continuing." + " Setting URL to this fallback in the meantime: ") + (fallbackURL)));
    if (!(changeToFallbackURL.equals("PROPERTY_NOT_FOUND")))
        runOnUiThread(changeToFallbackURL);
    
    final java.lang.Runnable refresher = new java.lang.Runnable() {
        public void run() {
            if (isOnline())
                switchToStandardMode();
            
        }
    };
    refresherHandle = scheduler.scheduleAtFixedRate(refresher, 0, 5, java.util.concurrent.TimeUnit.SECONDS);
}
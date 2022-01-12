private void loadOnDemand(final android.app.Activity _activity) {
    loadOndemand.removeCallbacksAndMessages(null);
    java.lang.Runnable loadOnDemandRunnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            _activity.runOnUiThread(new java.lang.Runnable() {
                public void run() {
                    loadViews(false, true);
                }
            });
        }
    };
    loadOndemand.removeCallbacks(loadOnDemandRunnable);
    loadOndemand.postDelayed(loadOnDemandRunnable, 1000);
}
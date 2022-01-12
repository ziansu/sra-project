public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.content.SharedPreferences sPref = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    final java.lang.String savedText = sPref.getString("SearchMyCarRequest", "");
    java.lang.Thread t = new java.lang.Thread(new java.lang.Runnable() {
        @android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
        public void run() {
            try {
                someTask(savedText);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    });
    t.start();
    return START_STICKY;
}
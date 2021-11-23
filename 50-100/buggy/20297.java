public void counting(final int target) {
    android.os.Looper.prepare();
    progressDialog = android.app.ProgressDialog.show(this, "", "Завантажуються ваші координати");
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            startService(target);
        }
    }).start();
    android.os.Looper.loop();
}
private void startService(final int target) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (checkAccess()) {
                startActivity(new android.content.Intent(com.example.hjk.testing.MainActivity.this, com.example.hjk.testing.Info.class).putExtra("id", id).putExtra("driver", driv).putExtra("target", target));
            }else {
                android.os.Looper.prepare();
                accessError();
                android.os.Looper.loop();
            }
        }
    }).start();
}
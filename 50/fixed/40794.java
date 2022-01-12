public void btDisconnected() {
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            btConnect.setIcon(R.drawable.not);
        }
    });
}
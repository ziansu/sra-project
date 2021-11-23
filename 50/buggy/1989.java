private void refreshUI() {
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            adapter.refresh();
        }
    });
}
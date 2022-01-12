private void refreshUI() {
    if ((adapter) == null) {
        return ;
    }
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            adapter.refresh();
        }
    });
}
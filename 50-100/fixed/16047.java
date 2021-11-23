@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((mProductManager) == null)
        return ;
    
    if (!(mProductManager.handleActivityResult(requestCode, resultCode, data))) {
        super.onActivityResult(requestCode, resultCode, data);
    }
    mProductManager.refreshInventory(this, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            refreshUI();
        }
    });
}
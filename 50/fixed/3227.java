@java.lang.Override
protected void onResume() {
    super.onResume();
    mProductManager = com.idkjava.thelements.ElementsApplication.getProductManager();
    mProductManager.refreshInventory(this, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            refreshUI();
        }
    });
}
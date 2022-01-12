private void updateAdapterAsPrivate(java.lang.Boolean isPrivate, com.almende.dialog.accounts.AdapterConfig adapter) {
    if ((isPrivate != null) && isPrivate) {
        adapter.markAsPrivate();
        adapter.update();
    }
}
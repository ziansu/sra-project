private void addMoreItems() {
    android.content.Intent addIntent = new android.content.Intent(this, com.taneja.ajay.gstbilling.NewBillActivity.class);
    addIntent.putExtra(com.taneja.ajay.gstbilling.DetailActivity.ADDING_MORE_ITEMS, true);
    addIntent.putExtra(GSTBillingContract.GSTBillingEntry._ID, com.taneja.ajay.gstbilling.DetailActivity.billId);
    addIntent.putExtra(GSTBillingContract.GSTBillingEntry.PRIMARY_COLUMN_NAME, customerName);
    addIntent.putExtra(GSTBillingContract.GSTBillingEntry.PRIMARY_COLUMN_PHONE_NUMBER, phoneNumber);
    startActivity(addIntent);
    finish();
}
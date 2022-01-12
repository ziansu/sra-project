@java.lang.Override
protected void onResume() {
    super.onResume();
    java.lang.String[] item = new java.lang.String[]{ "Exchange Rate" , "Transaction Fees" , "Payment Service Provider" };
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter<java.lang.String>(this, android.R.layout.simple_expandable_list_item_1, item);
    lvSetting.setAdapter(adapter);
    lvSetting.setOnItemClickListener(this);
    registerBroadcast(this, cmdManager);
}
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_shift);
    shiftDate = com.samwooler.stock.utils.DateUtils.getCurrentTime();
    java.lang.String dateString = com.samwooler.stock.utils.DateUtils.getFormattedDate(shiftDate, "dd-MM-yyyy");
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.setTitle(dateString);
    com.samwooler.stock.utils.ProductListAdapter adapter = new com.samwooler.stock.utils.ProductListAdapter(this, products);
    android.widget.ListView listView = ((android.widget.ListView) (findViewById(R.id.shift_product_list)));
    listView.setAdapter(adapter);
}
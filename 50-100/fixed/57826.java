@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_edit_bill);
    bills = new java.util.ArrayList<>();
    loadBills();
    partialBills = new java.util.ArrayList<>();
    if ((bills) != null) {
        partialBills = bills;
    }
    findViewsById();
    setSearch();
    setListAdapter();
}
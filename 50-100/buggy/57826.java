@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_edit_bill);
    loadBills();
    partialBills = new java.util.ArrayList<>();
    partialBills = bills;
    findViewsById();
    setSearch();
    setListAdapter();
}
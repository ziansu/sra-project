@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    final java.lang.String TAG = "onCreate";
    android.os.Bundle extras = getIntent().getExtras();
    this.selecting = extras.getBoolean("selecting");
    setContentView(R.layout.contact_list);
    try {
        stammgoodapps.cats.ListViewLoader.PopulateContactList populateContactList = new stammgoodapps.cats.ListViewLoader.PopulateContactList();
        populateContactList.execute().get();
    } catch (java.lang.Exception e) {
        android.util.Log.e(TAG, e.getMessage());
    }
}
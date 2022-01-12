@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    listView = ((android.widget.ListView) (findViewById(R.id.vaccines_list)));
    loadDataWithCursor();
}
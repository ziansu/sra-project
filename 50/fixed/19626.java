@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_note_list);
    context = this;
    listView = ((android.widget.ListView) (findViewById(R.id.list)));
    refreshData();
}
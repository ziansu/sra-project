@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    datasource = new de.vogella.android.sqlite.first.CommentsDataSource(this);
    java.util.List<de.vogella.android.sqlite.first.Comment> values = datasource.getAllComments();
    android.widget.ArrayAdapter<de.vogella.android.sqlite.first.Comment> adapter = new android.widget.ArrayAdapter<de.vogella.android.sqlite.first.Comment>(this, android.R.layout.simple_list_item_1, values);
    setListAdapter(adapter);
}
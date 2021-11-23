@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_keyword_list);
    keywordListView = ((android.widget.ListView) (findViewById(R.id.keywords_list)));
    prepareListData();
    keywordListAdapter = new com.eventhorizonwebdesign.cpocketreference.adapters.KeywordListAdapter(this, content);
    keywordListView.setAdapter(keywordListAdapter);
    keywordListView.addHeaderView(getLayoutInflater().inflate(R.layout.ascii_list_item_header, keywordListView, false));
}
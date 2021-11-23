@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.list_mode);
    updateListView();
    mListView = getListView();
    mListView.setTextFilterEnabled(true);
    mListView.setOnScrollListener(ftStoryScroll);
    mListView.setOnItemClickListener(ftStoryClick);
    registerForContextMenu(mListView);
}
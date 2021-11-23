@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_choose_market);
    findViews();
    setListeners();
    supportActionBar();
    setSearchSuggestionAdapter();
    initRececlerView();
    com.example.framgia.imarketandroid.util.findpath.InternetUtil.isInternetConnected(this);
}
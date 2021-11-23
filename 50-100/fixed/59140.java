@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mSearchBoxEditText = ((android.widget.EditText) (findViewById(R.id.et_search_box)));
    mUrlDisplayTextView = ((android.widget.TextView) (findViewById(R.id.tv_url_display)));
    mSearchResultsTextView = ((android.widget.TextView) (findViewById(R.id.tv_github_search_results_json)));
}
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mSearchBoxEditText = ((android.widget.EditText) (mSearchBoxEditText.findViewById(R.id.et_search_box)));
    mUrlDisplayTextView = ((android.widget.TextView) (mUrlDisplayTextView.findViewById(R.id.tv_url_display)));
    mSearchResultsTextView = ((android.widget.TextView) (mSearchResultsTextView.findViewById(R.id.tv_github_search_results_json)));
}
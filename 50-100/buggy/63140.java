@java.lang.Override
public void onJsonError() {
    android.support.design.widget.Snackbar.make(findViewById(R.id.activity_main), getResources().getString(R.string.json_error), Snackbar.LENGTH_LONG).show();
    mIssuesAdapter.setIssues(java.util.Collections.<org.a5calls.android.a5calls.model.Issue>emptyList());
    swipeContainer.setRefreshing(false);
}
@java.lang.Override
public void onLoading() {
    mGroupsListView.setVisibility(View.GONE);
    mLoadingIndicator.setVisibility(View.VISIBLE);
    mNoGroupsTextView.setVisibility(View.GONE);
}
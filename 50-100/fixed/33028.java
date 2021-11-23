@java.lang.Override
public void onLoaded(List<com.wisecityllc.cookedapp.parseClasses.Group> list, java.lang.Exception e) {
    mGroupsListView.setVisibility(View.VISIBLE);
    mLoadingIndicator.setVisibility(View.GONE);
    mNoGroupsTextView.setVisibility(((list != null) && ((list.size()) == 0) ? View.VISIBLE : View.GONE));
}
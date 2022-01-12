@java.lang.Override
public void onViewCreated(final android.view.View view, final android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if (savedInstanceState != null) {
        mWasSearchBoxOpen = savedInstanceState.getBoolean(org.twizer.android.ui.fragment.ContentFragment.KEY_IS_SEARCH_BOX_OPEN);
    }
    initSearchBox(mContext, mSearchBox, savedInstanceState);
    setupTweetView(mNiceLoadTweetView);
    setupFab(mTweetContainer);
}
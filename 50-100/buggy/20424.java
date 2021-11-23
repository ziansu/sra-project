@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    mPullRefreshView.setOnRefreshListener(this);
    mListView.setAdapter(new com.cleveroad.fireworkpulltorefresh.ListViewFragment.SampleAdapter(getActivity(), R.layout.list_item, com.cleveroad.fireworkpulltorefresh.ListViewFragment.mDummyList));
    mPullRefreshView.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mPullRefreshView.setRefreshing(mIsRefreshing);
        }
    });
    mPullRefreshView.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mPullRefreshView.setRefreshing(true);
        }
    }, 3000);
}
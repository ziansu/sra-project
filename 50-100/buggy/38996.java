@java.lang.Override
public void onRefresh() {
    mList.clear();
    for (int i = 0; i < 10; i++) {
        java.lang.String str = "item" + (i + 1);
        mList.add(str);
    }
    mListView.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mAdappter.notifyDataSetChanged();
            mListView.onRefreshComplete();
        }
    }, 3000);
}
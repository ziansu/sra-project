@java.lang.Override
public void run() {
    mList.clear();
    for (int i = 0; i < 10; i++) {
        java.lang.String str = "item" + (i + 1);
        mList.add(str);
    }
    mAdappter.notifyDataSetChanged();
    mListView.onRefreshComplete();
}
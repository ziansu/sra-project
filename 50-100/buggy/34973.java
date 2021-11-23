@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(MainActivity.ACTION_TODAY)) {
        android.support.v7.widget.LinearLayoutManager linearLayoutManager = ((android.support.v7.widget.LinearLayoutManager) (mRecyclerViewEvents.getLayoutManager()));
        int firstVisibleItem = linearLayoutManager.findFirstVisibleItemPosition();
        int lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
        if (firstVisibleItem > (mPositionToday)) {
            mRecyclerViewEvents.scrollToPosition(((mPositionToday) - 2));
        }else {
            mRecyclerViewEvents.scrollToPosition(((mPositionToday) + 5));
        }
    }
}
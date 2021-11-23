@java.lang.Override
protected void onLoadCursorFinished(android.database.Cursor cursor) {
    android.support.v4.app.FragmentActivity activity = getActivity();
    if (activity != null) {
        if (cursor != null) {
            by.dzmitryslutskiy.vkclient.ui.adapters.FriendCursorAdapter adapter = new by.dzmitryslutskiy.vkclient.ui.adapters.FriendCursorAdapter(activity, cursor);
            mListView.setAdapter(adapter);
            if ((mLastVisibleIndex) != 0) {
                mListView.setSelectionFromTop(mLastVisibleIndex, mOffsetTop);
                mLastVisibleIndex = 0;
            }
        }
    }
}
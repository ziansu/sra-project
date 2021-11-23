@java.lang.Override
public void onStop() {
    super.onDestroy();
    if ((mCursor) != null) {
        mCursor.close();
    }
}
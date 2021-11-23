@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader loader) {
    if ((mCursorAdapter.getCursor()) != null) {
        mCursorAdapter.getCursor().close();
    }
    mCursorAdapter.swapCursor(null);
}
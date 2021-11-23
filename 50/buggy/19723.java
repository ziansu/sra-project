@java.lang.Override
public void onLoaderReset() {
    getListAdapter().changeCursor(null);
    setListAdapter(null);
}
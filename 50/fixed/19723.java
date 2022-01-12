@java.lang.Override
public void onLoaderReset() {
    if ((getView()) != null) {
        getListAdapter().changeCursor(null);
        setListAdapter(null);
    }
}
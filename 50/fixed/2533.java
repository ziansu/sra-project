@java.lang.Override
public boolean onClose() {
    openProgressDialog();
    rest = list.search(null, listener);
    android.util.Log.d(diy.uigeneric.sampleserver.SampleServerListActivity.TAG, "search stop");
    return false;
}
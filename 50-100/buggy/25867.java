@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i("RESUME", "onResume performed from SessionListFragment");
    try {
        items = it.dei.unipd.esp1415.utils.LocalStorage.getSessionInfos();
    } catch (java.io.IOException e) {
        android.util.Log.i("ERROR", "Error getting session list - LocalStorage");
    }
    setListAdapter(new it.dei.unipd.esp1415.adapters.SessionAdapter(getActivity(), items));
}
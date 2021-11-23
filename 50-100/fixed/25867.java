@java.lang.Override
public void onResume() {
    super.onResume();
    try {
        items = it.dei.unipd.esp1415.utils.LocalStorage.getSessionInfos();
    } catch (java.io.IOException e) {
        android.util.Log.i("ERROR", "Error getting session list - LocalStorage");
    }
    setListAdapter(new it.dei.unipd.esp1415.adapters.SessionAdapter(getActivity(), items));
}
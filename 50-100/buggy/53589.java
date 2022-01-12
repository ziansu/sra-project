@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.i("RESUME", "onResume performed from SessionListActivity");
    java.lang.String value = it.dei.unipd.esp1415.utils.PreferenceStorage.getSimpleData(it.dei.unipd.esp1415.activity.SessionListActivity.context, "isSessionRunning");
    if (value.equals(""))
        isSessionRunning = false;
    else
        isSessionRunning = java.lang.Boolean.parseBoolean(value);
    
    if (isSessionRunning)
        it.dei.unipd.esp1415.activity.SessionListActivity.fabButton.setVisibility(View.GONE);
    else
        it.dei.unipd.esp1415.activity.SessionListActivity.fabButton.setVisibility(View.VISIBLE);
    
}
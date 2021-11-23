@java.lang.Override
public void onResume() {
    super.onResume();
    java.lang.String value = it.dei.unipd.esp1415.utils.PreferenceStorage.getSimpleData(context, "isSessionRunning");
    if (value.equals(""))
        it.dei.unipd.esp1415.activity.SessionListActivity.isSessionRunning = false;
    else
        it.dei.unipd.esp1415.activity.SessionListActivity.isSessionRunning = java.lang.Boolean.parseBoolean(value);
    
    if (it.dei.unipd.esp1415.activity.SessionListActivity.isSessionRunning)
        it.dei.unipd.esp1415.activity.SessionListActivity.fabButton.setVisibility(View.GONE);
    else
        it.dei.unipd.esp1415.activity.SessionListActivity.fabButton.setVisibility(View.VISIBLE);
    
}
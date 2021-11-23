@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((com.civilien.app.BaseActivity.User_Data.length()) != 0) {
        outState.putString("User_Data", com.civilien.app.BaseActivity.User_Data.toString());
    }
    if ((com.civilien.app.BaseActivity.IncidentData.length()) != 0) {
        outState.putString("IncidentData", com.civilien.app.BaseActivity.IncidentData.toString());
    }
    super.onSaveInstanceState(outState);
}
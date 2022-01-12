@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    android.os.Bundle appStateData = new android.os.Bundle();
    if ((com.civilien.app.BaseActivity.User_Data.length()) != 0) {
        appStateData.putString("User_Data", com.civilien.app.BaseActivity.User_Data.toString());
    }
    if ((com.civilien.app.BaseActivity.IncidentData.length()) != 0) {
        appStateData.putString("IncidentData", com.civilien.app.BaseActivity.IncidentData.toString());
    }
    outState.putBundle("App state", appStateData);
    super.onSaveInstanceState(outState);
}
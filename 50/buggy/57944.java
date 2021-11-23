@java.lang.Override
protected void onResume() {
    updateSMSCPref();
    registerListeners();
    super.onResume();
}
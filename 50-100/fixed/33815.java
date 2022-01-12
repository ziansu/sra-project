@java.lang.Override
public void onResume() {
    super.onResume();
    net.kourlas.voipms_sms.activities.App.getInstance().setCurrentActivity(this);
    conversationsListViewAdapter.refresh();
    if (!(net.kourlas.voipms_sms.activities.Preferences.getInstance(getApplicationContext()).getFirstRun())) {
        net.kourlas.voipms_sms.activities.Api.getInstance(getApplicationContext()).updateSmsDatabase(conversationsActivity, true, false);
    }
    net.kourlas.voipms_sms.gcm.Gcm.getInstance(getApplicationContext()).registerForGcm(this, false, false);
}
@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    int selectedItem = selectedItemList.get(0);
    preferences.setDid(didsArray[selectedItem]);
    net.kourlas.voipms_sms.Database.getInstance(applicationContext).deleteAllSMS();
    if ((sourceActivity) instanceof net.kourlas.voipms_sms.activities.ConversationsActivity) {
        net.kourlas.voipms_sms.activities.ConversationsActivity conversationsActivity = ((net.kourlas.voipms_sms.activities.ConversationsActivity) (sourceActivity));
        conversationsActivity.getConversationsListViewAdapter().refresh();
        updateSmsDatabase(sourceActivity, true, false);
    }
    net.kourlas.voipms_sms.gcm.Gcm.getInstance(applicationContext).registerForGcm(sourceActivity, false);
}
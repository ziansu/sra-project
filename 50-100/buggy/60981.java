@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(TelephonyIntents.ACTION_ANY_DATA_CONNECTION_STATE_CHANGED)) {
        com.android.internal.telephony.PhoneConstants.DataState state = com.android.settings.ApnSettings.getMobileDataState(intent);
        switch (state) {
            case CONNECTED :
                if (!(com.android.settings.ApnSettings.mRestoreDefaultApnMode)) {
                    fillList();
                }else {
                    showDialog(com.android.settings.ApnSettings.DIALOG_RESTORE_DEFAULTAPN);
                }
                break;
        }
    }
}
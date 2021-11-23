@java.lang.Override
public void onVpnConnected() {
    android.util.Log.d("APP_FLOW", "Creating profile and register");
    listener.onVpnConnected();
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.csipsimple.api.SipProfile sipAccount = com.augeo.siphelper.sipprofilehelper.SipProfileBuilder.generateFromDeviceProfile(deviceProfile);
            sipAccount.active = true;
            com.augeo.siphelper.sipprofilehelper.SipProfileDatabaseHelper.createProfileAndRegister(mContext, sipAccount);
            listener.onSipAccountSavedToDatabase(sipAccount);
            com.csipsimple.widgets.AccountWidgetProvider.updateWidget(mContext);
        }
    });
}
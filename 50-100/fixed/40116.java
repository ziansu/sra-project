@java.lang.Override
public void run() {
    android.util.Log.d("APP_FLOW", "Creating profile and register");
    sipAccount = com.augeo.siphelper.sipprofilehelper.SipProfileBuilder.generateFromDeviceProfile(deviceProfile);
    sipAccount.active = true;
    com.augeo.siphelper.sipprofilehelper.SipProfileDatabaseHelper.createProfileAndRegister(mContext, sipAccount);
    listener.onSipAccountSavedToDatabase(sipAccount);
    com.csipsimple.widgets.AccountWidgetProvider.updateWidget(mContext);
}
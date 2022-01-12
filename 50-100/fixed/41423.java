@java.lang.Override
public void onSuccess() {
    mDomoticz.AddMobileDevice(UUID, senderId, new nl.hnogames.domoticzapi.Interfaces.MobileDeviceReceiver() {
        @java.lang.Override
        public void onSuccess() {
            if (isAdded())
                showSnackbar(mContext.getString(R.string.notification_settings_pushed));
            
        }

        @java.lang.Override
        public void onError(java.lang.Exception error) {
            if (isAdded())
                showSnackbar(mContext.getString(R.string.notification_settings_push_failed));
            
        }
    });
}
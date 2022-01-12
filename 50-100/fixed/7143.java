private void presentNotificationsList(final org.apache.cordova.CallbackContext callbackContext) {
    if (0 == (com.vidinoti.android.vdarsdk.VDARSDKController.getInstance().getPendingNotifications().size())) {
        callbackContext.error("empty");
    }else {
        callbackContext.success();
        com.vidinoti.android.vdarsdk.VDARSDKController.getInstance().presentNotificationsList();
    }
}
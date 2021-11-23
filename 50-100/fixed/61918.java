public void rejectCallWithMessage(java.lang.String message) {
    int phoneId = getActivePhoneId();
    com.android.incallui.Log.i(this, ("rejectCallWithMessage phoneId:" + phoneId));
    if (phoneId != (-1)) {
        com.android.incallui.TelecomAdapter.getInstance().rejectCall(mCall[phoneId].getId(), true, message);
    }
    onDismissDialog();
}
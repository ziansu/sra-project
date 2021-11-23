public void onBlockDialogInitialize() {
    int phoneId = getActivePhoneId();
    com.android.incallui.Log.d(this, ((("onBlock mCallId:" + (mCallId)) + "phoneId:") + phoneId));
    if (phoneId == (-1)) {
        return ;
    }
    com.android.incallui.Call call = mCall[phoneId];
    final java.lang.String number = call.getNumber();
    final android.content.Context context = getUi().getContext();
    mBlockContactHelper = new com.android.contacts.common.util.BlockContactHelper(context);
    mBlockContactHelper.setContactInfo(number);
}
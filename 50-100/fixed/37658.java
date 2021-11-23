private void confirmPhoneNumber() {
    if (((getContainer()) == null) || ((editTextPhone) == null)) {
        return ;
    }
    getContainer().enableProgress(true);
    com.waz.zclient.ui.utils.KeyboardUtils.hideKeyboard(getActivity());
    getControllerFactory().getTrackingController().tagEvent(new com.waz.zclient.core.controllers.tracking.events.session.EnteredLoginPhoneEvent());
    getStoreFactory().getAppEntryStore().setSignInPhone(textViewCountryCode.getText().toString(), editTextPhone.getText().toString(), errorCallback);
}
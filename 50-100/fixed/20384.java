@java.lang.Override
public void onAccountCreatorPhoneAccountRecovered(org.linphone.core.LinphoneAccountCreator accountCreator, org.linphone.core.LinphoneAccountCreator.RequestStatus status) {
    if ((org.linphone.assistant.AssistantActivity.instance()) == null) {
        return ;
    }
    if (status.equals(RequestStatus.Ok)) {
        org.linphone.assistant.AssistantActivity.instance().displayAssistantCodeConfirm(getUsername(), phoneNumberEdit.getText().toString(), dialCode.getText().toString(), false);
    }else {
        createAccount.setEnabled(true);
        org.linphone.LinphoneUtils.displayErrorAlert(getString(R.string.request_failed), org.linphone.assistant.AssistantActivity.instance());
    }
}
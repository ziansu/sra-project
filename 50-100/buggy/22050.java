@java.lang.Override
public void onAccountCreatorPhoneAccountRecovered(org.linphone.core.LinphoneAccountCreator accountCreator, org.linphone.core.LinphoneAccountCreator.Status status) {
    if (status.equals(Status.Ok)) {
        org.linphone.assistant.AssistantActivity.instance().displayAssistantCodeConfirm(getUsername(), dialCode.getText().toString(), phoneNumberEdit.getText().toString(), false);
    }else {
        createAccount.setEnabled(true);
        org.linphone.LinphoneUtils.displayErrorAlert(getString(R.string.request_failed), org.linphone.assistant.AssistantActivity.instance());
    }
}
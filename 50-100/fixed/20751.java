@java.lang.Override
public void onAccountCreatorAccountLinkedWithPhoneNumber(org.linphone.core.LinphoneAccountCreator accountCreator, org.linphone.core.LinphoneAccountCreator.Status status) {
    if ((org.linphone.assistant.AssistantActivity.instance()) == null) {
        return ;
    }
    if (status.equals(Status.Ok)) {
        org.linphone.assistant.AssistantActivity.instance().displayAssistantCodeConfirm(getUsername(), phoneNumberEdit.getText().toString(), org.linphone.LinphoneUtils.getCountryCode(dialCode), false);
    }
}
@java.lang.Override
public void onAccountCreatorPhoneNumberLinkActivated(org.linphone.core.LinphoneAccountCreator accountCreator, org.linphone.core.LinphoneAccountCreator.Status status) {
    if (status.equals(LinphoneAccountCreator.Status.Ok)) {
        org.linphone.LinphonePreferences.instance().setLinkPopupTime("");
        org.linphone.assistant.AssistantActivity.instance().hideKeyboard();
        org.linphone.assistant.AssistantActivity.instance().success();
    }
}
@java.lang.Override
public void onAccountCreatorIsPhoneNumberUsed(org.linphone.core.LinphoneAccountCreator accountCreator, org.linphone.core.LinphoneAccountCreator.Status status) {
    if ((org.linphone.assistant.AssistantActivity.instance()) == null) {
        apply.setEnabled(true);
        return ;
    }
    if ((status.equals(LinphoneAccountCreator.Status.PhoneNumberUsedAccount)) || (status.equals(LinphoneAccountCreator.Status.PhoneNumberUsedAlias))) {
        accountCreator.recoverPhoneAccount();
    }else {
        apply.setEnabled(true);
        org.linphone.LinphoneUtils.displayErrorAlert(org.linphone.LinphoneUtils.errorForStatus(status), org.linphone.assistant.AssistantActivity.instance());
    }
}
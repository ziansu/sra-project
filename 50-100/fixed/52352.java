@java.lang.Override
public void onDialogClosed(com.android.phone.EditPhoneNumberPreference preference, int buttonClicked) {
    if (com.android.phone.settings.VoicemailSettingsActivity.DBG)
        com.android.phone.settings.VoicemailSettingsActivity.log(("onDialogClosed: Button clicked is " + buttonClicked));
    
    if (buttonClicked == (android.content.DialogInterface.BUTTON_NEGATIVE)) {
        return ;
    }
    com.android.phone.settings.VoicemailProviderSettings newSettings = new com.android.phone.settings.VoicemailProviderSettings(preference.getPhoneNumber(), VoicemailProviderSettings.NO_FORWARDING);
    saveVoiceMailAndForwardingNumber(mVoicemailProviders.getKey(), newSettings);
}
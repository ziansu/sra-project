@java.lang.Override
protected void doConversationRequest(com.derpgroup.derpwizard.voice.model.VoiceInput voiceInput, com.derpgroup.derpwizard.voice.model.ServiceOutput serviceOutput) throws com.derpgroup.derpwizard.voice.exception.DerpwizardException {
    switchOnSubject(voiceInput.getMessageSubject(), voiceInput, serviceOutput);
}
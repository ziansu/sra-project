private void updateTextToSpeechSettingsFromPreferences() {
    if ((m_textToSpeech) != null) {
        m_textToSpeech.setPitch(getCurrentTTSPitch());
        m_textToSpeech.setSpeechRate(getCurrentTTSSpeechRate());
    }
}
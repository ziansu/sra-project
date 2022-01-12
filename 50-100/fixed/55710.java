private void checkAssistant() {
    java.lang.String currentAssistant = Settings.Secure.getString(getContentResolver(), "voice_interaction_service");
    if ((currentAssistant != null) && ((currentAssistant.equals((((getPackageName()) + "/.") + (com.tomer.screenshotsharer.AssistLoggerService.class.getSimpleName())))) || (currentAssistant.contains(getPackageName()))))
        assistant.setChecked(true);
    else
        assistant.setChecked(false);
    
    assistant.setOnTouchListener(this);
}
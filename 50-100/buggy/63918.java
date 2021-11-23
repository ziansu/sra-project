private boolean isAssistantEnabled() {
    final java.lang.String assistantComponent = Settings.Secure.getString(getContentResolver(), "voice_interaction_service");
    if (assistantComponent == null)
        return false;
    
    final android.content.ComponentName cn = android.content.ComponentName.unflattenFromString(assistantComponent);
    final java.lang.String assistantPackage = cn.getPackageName();
    return assistantPackage.equals(getPackageName());
}
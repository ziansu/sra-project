@java.lang.Override
protected void syncPreferencesWithUI() {
    getStore().putBoolean(com.mentor.nucleus.bp.core.ui.preferences.BridgePointProjectActionLanguagePreferences.ENABLE_ERROR_FOR_EMPTY_SYNCHRONOUS_MESSAGE_REALIZED, enableErrorForEmptySynchronousMessageRealized.getSelection());
    getStore().putBoolean(com.mentor.nucleus.bp.core.ui.preferences.BridgePointProjectActionLanguagePreferences.ENABLE_ERROR_FOR_EMPTY_SYNCHRONOUS_MESSAGE, enableErrorForEmptySynchronousMessage.getSelection());
}
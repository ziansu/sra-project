public static void enableFieldAdaptations(boolean enabled) {
    org.eclipse.jface.preference.IPreferenceStore preferences = com.ensoftcorp.open.immutability.Activator.getDefault().getPreferenceStore();
    preferences.setValue(com.ensoftcorp.open.immutability.preferences.ImmutabilityPreferences.USE_FIELD_ADAPTATIONS, enabled);
    com.ensoftcorp.open.immutability.preferences.ImmutabilityPreferences.loadPreferences();
}
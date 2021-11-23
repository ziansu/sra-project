public void initializeDefaultPreferences() {
    org.eclipse.jface.preference.IPreferenceStore store = cceclipseplugin.Activator.getDefault().getPreferenceStore();
    store.setDefault(PreferenceConstants.P_BOOLEAN, false);
    store.setDefault(PreferenceConstants.P_CHOICE, "choice2");
    store.setDefault(PreferenceConstants.P_STRING, "Default value");
    store.setDefault(PreferenceConstants.AUTO_CONNECT, true);
}
public static void initDefaults(org.eclipse.jface.preference.IPreferenceStore store) {
    org.eclipse.gmf.runtime.diagram.ui.preferences.PrintingPreferencePage.initDefaults(store);
    store.setDefault(SiriusDiagramUiPreferencesKeys.PREF_PRINT_DECORATION.name(), true);
}
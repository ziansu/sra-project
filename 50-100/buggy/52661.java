public static void initDefaults(org.eclipse.jface.preference.IPreferenceStore store) {
    org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage.initDefaults(store);
    store.setDefault(SiriusDiagramUiPreferencesKeys.PREF_OLD_UI.name(), false);
    store.setDefault(SiriusDiagramUiPreferencesKeys.PREF_HIDE_LABEL_ICONS_ON_SHAPES.name(), false);
    store.setDefault(SiriusDiagramUiPreferencesKeys.PREF_HIDE_LABEL_ICONS_ON_CONNECTORS.name(), false);
    store.setDefault(SiriusDiagramUiPreferencesKeys.PREF_AUTHORIZE_DECORATION_OVERLAP.name(), true);
}
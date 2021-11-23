public void applyLookAndFeel() {
    java.lang.String cn = preferences.getLookAndFeelClassName();
    if (cn != null) {
        applyLookAndFeel(cn);
    }
    cn = com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.getLookAndFeelClassNameFromName(preferences.getLookAndFeelName());
    if (cn != null) {
        applyLookAndFeel(cn);
    }
}
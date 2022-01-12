public void applyLookAndFeel() {
    java.lang.String cn = this.preferences.getLookAndFeelClassName();
    if (cn != null) {
        applyLookAndFeel(cn);
    }
    cn = com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.getLookAndFeelClassNameFromName(this.preferences.getLookAndFeelName());
    if (cn != null) {
        applyLookAndFeel(cn);
    }
}
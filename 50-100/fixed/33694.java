public void setLookAndFeelInfo(final javax.swing.UIManager.LookAndFeelInfo lafi) {
    this.preferences.setLookAndFeelClassName(lafi.getClassName());
    this.preferences.setLookAndFeelName(lafi.getName());
    if (com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.isTraceEnabled()) {
        com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.trace(("setLookAndFeelInfo: " + lafi));
        com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.trace(("lookAndFeelClassName: " + (this.preferences.getLookAndFeelClassName())));
        com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.trace(("lookAndFeelName: " + (this.preferences.getLookAndFeelName())));
    }
}
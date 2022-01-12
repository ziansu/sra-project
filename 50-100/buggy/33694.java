public void setLookAndFeelInfo(final javax.swing.UIManager.LookAndFeelInfo lafi) {
    preferences.setLookAndFeelClassName(lafi.getClassName());
    preferences.setLookAndFeelName(lafi.getName());
    if (com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.isTraceEnabled()) {
        com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.trace(("setLookAndFeelInfo: " + lafi));
        com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.trace(("lookAndFeelClassName: " + (preferences.getLookAndFeelClassName())));
        com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.trace(("lookAndFeelName: " + (preferences.getLookAndFeelName())));
    }
}
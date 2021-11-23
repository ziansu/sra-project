public static boolean setLanguageAndRestart(java.awt.Component parentComponent, java.lang.String language) {
    int result = javax.swing.JOptionPane.showConfirmDialog(parentComponent, com.resinet.util.Strings.getLocalizedString("restart.for.language.dialog"), com.resinet.util.Strings.getLocalizedString("warning"), javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
    if (result == (javax.swing.JOptionPane.YES_OPTION)) {
        com.resinet.util.Strings.preferences.put("language", language);
        com.resinet.util.Util.restartApplication();
        return true;
    }
    return false;
}
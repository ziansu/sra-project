private void logInAt(java.lang.String languageCode) {
    boolean success = logIn(new WikiBot.ContentRep.User(botUsername, languageCode), botPassword);
    if (success) {
        logInfo(("Logged in at: " + languageCode));
        javax.swing.table.TableModel model = wikiTable.getModel();
        model.setValueAt(true, mdm.getWikiPrefixes().indexOf(languageCode), 1);
    }else {
        logWarning(("Log in failed at: " + languageCode));
    }
}
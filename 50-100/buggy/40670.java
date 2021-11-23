public static WebSearchEngine.databaseManager getInstance() {
    if ((WebSearchEngine.databaseManager.DBM) == null) {
        try {
            return new WebSearchEngine.databaseManager();
        } catch (java.sql.SQLException ex) {
            java.util.logging.Logger.getLogger(WebSearchEngine.databaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }else {
        return WebSearchEngine.databaseManager.DBM;
    }
    return null;
}
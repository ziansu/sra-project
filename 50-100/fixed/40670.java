public static WebSearchEngine.databaseManager getInstance() {
    if ((WebSearchEngine.databaseManager.DBM) == null) {
        try {
            WebSearchEngine.databaseManager.DBM = new WebSearchEngine.databaseManager();
            return WebSearchEngine.databaseManager.DBM;
        } catch (java.sql.SQLException ex) {
            java.util.logging.Logger.getLogger(WebSearchEngine.databaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }else {
        return WebSearchEngine.databaseManager.DBM;
    }
    return null;
}
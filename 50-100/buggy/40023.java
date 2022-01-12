int Execute() {
    WebSearchEngine.databaseManager DM;
    SB.setCharAt(((SB.length()) - 1), ';');
    try {
        DM = new WebSearchEngine.databaseManager();
        return DM.insertOrUpdate(SB.toString());
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(WebSearchEngine.ComplexInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return -1;
}
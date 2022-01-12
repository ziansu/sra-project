public void setSession(org.Session session, Database.DatabaseInterface dbInterface) {
    this.currSession = session;
    this.dictionary = session.dictionary;
    this.database = dbInterface;
    try {
        UIControllers.CentralUIController.database.load();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Failed to load from database");
    }
}
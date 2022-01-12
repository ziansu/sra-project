public void Start() throws java.lang.Exception {
    try {
        if (liguebaseball.MenuHandler.lectureAuClavier) {
            readInput();
        }else {
            readFile();
        }
        db.getConnexion().commit();
    } catch (java.lang.Exception ex) {
        logger.Log("An error occurred during a transaction: ");
        logger.Log(ex);
        db.getConnexion().rollback();
    }
    db.getConnexion().fermer();
}
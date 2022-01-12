protected void initDb() {
    try {
        if (db.isClosed()) {
            db.open(repositoryFactory.getApplicationSettings().getSetting("orientDB.login"), repositoryFactory.getApplicationSettings().getSetting("orientDB.password"));
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Could not open database.", e);
    }
}
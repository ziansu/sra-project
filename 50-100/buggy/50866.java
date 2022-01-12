protected void initDb() {
    try {
        if (db.isClosed()) {
            if (db.isPooled()) {
                org.segrada.service.repository.orientdb.base.AbstractOrientDbRepository.logger.warn("Cannot reopen closed remote db - fix this in code!");
            }else {
                db.open(repositoryFactory.getApplicationSettings().getSetting("orientDB.login"), repositoryFactory.getApplicationSettings().getSetting("orientDB.password"));
            }
        }
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Could not open database.", e);
    }
}
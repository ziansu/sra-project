public static void removeUserFromDatabase(java.lang.String userName, org.ektorp.CouchDbConnector database) {
    de.evoila.cf.broker.custom.couchdb.model.DatabaseSecurity securityDefinition = database.find(de.evoila.cf.broker.custom.couchdb.model.DatabaseSecurity.class, "_security");
    if (securityDefinition != null) {
        securityDefinition.getMembers().getNames().remove(userName);
        database.update(securityDefinition);
        database.ensureFullCommit();
    }
}
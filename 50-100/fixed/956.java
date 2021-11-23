public static void addUserToDatabase(java.lang.String userName, org.ektorp.CouchDbConnector newDatabase) {
    de.evoila.cf.broker.custom.couchdb.model.DatabaseSecurity securityDefinition = newDatabase.find(de.evoila.cf.broker.custom.couchdb.model.DatabaseSecurity.class, "_security");
    boolean securityDefinitionIsNew = false;
    if (securityDefinition == null) {
        securityDefinition = new de.evoila.cf.broker.custom.couchdb.model.DatabaseSecurity();
        securityDefinitionIsNew = true;
    }
    securityDefinition.getMembers().getNames().add(userName);
    if (securityDefinitionIsNew) {
        newDatabase.create("_security", securityDefinition);
    }else {
        newDatabase.create(securityDefinition);
    }
    newDatabase.ensureFullCommit();
}
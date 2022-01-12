public java.util.List<mg.angular.db.Contact> findAll() {
    java.util.List<mg.angular.db.Contact> allContacts;
    try {
        java.sql.Connection connection = dbConfig.getConnection();
        mg.util.db.persist.DB db = new mg.util.db.persist.DB(connection);
        mg.angular.db.Contact contact = new mg.angular.db.Contact();
        allContacts = db.findAllBy(contact);
    } catch (java.sql.SQLException | mg.util.db.persist.DBValidityException | mg.util.db.persist.DBMappingException | java.lang.ClassNotFoundException e) {
        logger.error("Error while trying to findAll contacts: ", e);
        allContacts = java.util.Collections.emptyList();
    }
    return allContacts;
}
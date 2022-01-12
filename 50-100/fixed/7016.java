public java.util.List<mg.angular.db.Contact> findAll() throws java.lang.ClassNotFoundException, java.sql.SQLException, mg.util.db.persist.DBMappingException, mg.util.db.persist.DBValidityException {
    java.util.List<mg.angular.db.Contact> allContacts;
    java.sql.Connection connection = dbConfig.getConnection();
    mg.util.db.persist.DB db = new mg.util.db.persist.DB(connection);
    mg.angular.db.Contact contact = new mg.angular.db.Contact();
    allContacts = db.findAllBy(contact);
    return allContacts;
}
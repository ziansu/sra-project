public mg.angular.db.Contact find(long id) throws java.lang.ClassNotFoundException, java.lang.IllegalArgumentException, java.sql.SQLException, mg.util.db.persist.DBMappingException, mg.util.db.persist.DBValidityException {
    mg.angular.db.Contact contact = null;
    mg.util.db.persist.DB db = new mg.util.db.persist.DB(dbConfig.getConnection());
    contact = db.findById(new mg.angular.db.Contact().setId(id));
    return contact;
}
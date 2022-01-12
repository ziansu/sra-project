public mg.angular.db.Contact find(long id) {
    mg.angular.db.Contact contact = null;
    try {
        mg.util.db.persist.DB db = new mg.util.db.persist.DB(dbConfig.getConnection());
        contact = db.findById(new mg.angular.db.Contact().setId(id));
    } catch (java.lang.IllegalArgumentException | java.lang.ClassNotFoundException | java.sql.SQLException | mg.util.db.persist.DBValidityException | mg.util.db.persist.DBMappingException e) {
        logger.error(("Unable to find contact for id: " + id), e);
    }
    return contact;
}
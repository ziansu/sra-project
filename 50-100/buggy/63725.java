private static void createUserSession(models.User user) {
    models.Session session = new models.Session();
    session._id = java.util.UUID.randomUUID().toString();
    session.createdDate = new org.joda.time.DateTime().toDate();
    session.email = user.email;
    session.isActive = true;
    org.jongo.MongoCollection sessions = controllers.MongoDBController.getCollection(CollectionNames.session);
    sessions.update("{email : #}", user.email).multi().with("{$set: {isActive : false}}");
    sessions.save(session);
    controllers.UserController.setCookieForUser(session, controllers.UserController.DEFAULT_COOKIE_DURATION);
}
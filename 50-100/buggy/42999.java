private void run(java.lang.String persistenceProvider, int numberOfDiffs) throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    java.lang.Class persistenceClass = java.lang.Class.forName(("server.persistence." + persistenceProvider));
    server.IPersistenceFactory factory = ((server.IPersistenceFactory) (persistenceClass.newInstance()));
    server.model.GameManager myGameManager = new server.model.GameManager(factory);
    server.model.UserManager myUserManager = new server.model.UserManager(factory);
    run(myGameManager, myUserManager);
}
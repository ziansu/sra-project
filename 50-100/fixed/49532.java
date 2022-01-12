public static void initHibernate() throws org.hibernate.exception.JDBCConnectionException {
    model.DBManager.lock.lock();
    if ((model.DBManager.configuration) == null) {
        model.DBManager.configuration = new org.hibernate.cfg.Configuration();
        model.DBManager.configuration.configure();
    }
    model.DBManager.serviceRegistry = new org.hibernate.boot.registry.StandardServiceRegistryBuilder().applySettings(model.DBManager.configuration.getProperties()).build();
    if ((model.DBManager.sessionFactory) == null) {
        model.DBManager.sessionFactory = model.DBManager.configuration.buildSessionFactory(model.DBManager.serviceRegistry);
    }
}
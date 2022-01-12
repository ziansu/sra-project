private static org.hibernate.SessionFactory buildSessionFactory() {
    try {
        final org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.configure("hibernate.cfg.xml");
        final org.hibernate.service.ServiceRegistry serviceRegistry = new org.hibernate.boot.registry.StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        configuration.addAnnotatedClass(com.systematic.trading.data.HistoryRetrievalRequest.class);
        return configuration.buildSessionFactory(serviceRegistry);
    } catch (final java.lang.Exception ex) {
        com.systematic.trading.data.util.HibernateUtil.LOG.error("Initial SessionFactory creation failed.", ex);
        throw new java.lang.ExceptionInInitializerError(ex);
    }
}
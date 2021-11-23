public static org.hibernate.SessionFactory configureSessionFactory() throws org.hibernate.HibernateException {
    org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
    configuration.configure();
    org.hibernate.service.ServiceRegistry serviceRegistry = new org.hibernate.service.ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
    return configuration.buildSessionFactory(serviceRegistry);
}
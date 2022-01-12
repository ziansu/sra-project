protected void configureServices(org.jboss.weld.bootstrap.api.Environment environment) {
    services.add(org.jboss.weld.transaction.spi.TransactionServices.class, new org.jboss.arquillian.container.weld.embedded.mock.MockTransactionServices());
    if ((environment.equals(Environments.EE)) || (environment.equals(Environments.EE_INJECT))) {
        services.add(org.jboss.weld.ejb.spi.EjbServices.class, new org.jboss.arquillian.container.weld.embedded.mock.MockEjBServices());
        services.add(org.jboss.weld.security.spi.SecurityServices.class, new org.jboss.arquillian.container.weld.embedded.mock.MockSecurityServices());
    }
}
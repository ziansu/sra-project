protected void establishConnectionFactory() {
    super.establishConnectionFactory();
    if (((getConnectionFactory()) instanceof javax.jms.XAConnectionFactory) && (!((getConnectionFactory()) instanceof org.jboss.narayana.jta.jms.ConnectionFactoryProxy))) {
        javax.jms.ConnectionFactory connectionFactoryProxy = new org.jboss.narayana.jta.jms.ConnectionFactoryProxy(((javax.jms.XAConnectionFactory) (getConnectionFactory())), new org.jboss.narayana.jta.jms.TransactionHelperImpl(localTransactionManager));
        setConnectionFactory(connectionFactoryProxy);
    }
}
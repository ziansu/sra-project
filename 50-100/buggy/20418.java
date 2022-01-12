protected void setupConnection(javax.naming.Context ctx) throws java.lang.Exception {
    org.jboss.resource.adapter.jms.inflow.JmsActivation.log.debug(("setup connection " + (this)));
    java.lang.String user = spec.getUser();
    java.lang.String pass = spec.getPassword();
    java.lang.String clientID = spec.getClientId();
    java.lang.String connectionFactory = spec.getConnectionFactory();
    connection = setupConnection(ctx, user, pass, clientID, connectionFactory);
    org.jboss.resource.adapter.jms.inflow.JmsActivation.log.debug(("established connection " + (this)));
}
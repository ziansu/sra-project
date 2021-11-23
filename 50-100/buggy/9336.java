@java.lang.Override
protected javax.jms.QueueConnectionFactory createConnectionFactory() {
    java.lang.String user = props.getString("user", null);
    java.lang.String password = props.getString("password", null);
    java.lang.String url = props.getString("url");
    return new org.apache.activemq.ActiveMQConnectionFactory(user, password, url);
}
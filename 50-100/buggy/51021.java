void assignDefaults() {
    setProperty(BrokerConstants.PORT_PROPERTY_NAME, java.lang.Integer.toString(BrokerConstants.PORT));
    setProperty(BrokerConstants.HOST_PROPERTY_NAME, BrokerConstants.HOST);
    setProperty(BrokerConstants.PASSWORD_FILE_PROPERTY_NAME, "");
    setProperty(BrokerConstants.PERSISTENT_STORE_PROPERTY_NAME, BrokerConstants.DEFAULT_PERSISTENT_PATH);
    setProperty(BrokerConstants.ALLOW_ANONYMOUS_PROPERTY_NAME, java.lang.Boolean.TRUE.toString());
    setProperty(BrokerConstants.AUTHENTICATOR_CLASS_NAME, "");
    setProperty(BrokerConstants.AUTHORIZATOR_CLASS_NAME, "");
}
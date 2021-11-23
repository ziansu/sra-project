@java.lang.Override
public java.lang.Object createConnectionFactory() throws javax.resource.ResourceException {
    return new ch.ninecode.cim.connector.CIMConnectionFactory(this, null);
}
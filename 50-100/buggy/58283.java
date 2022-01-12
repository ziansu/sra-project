protected final com.unboundid.ldap.sdk.BindResult sendBindRequest(final com.unboundid.ldap.sdk.LDAPConnection connection, final java.lang.String bindDN, final com.unboundid.asn1.ASN1OctetString saslCredentials, final com.unboundid.ldap.sdk.Control[] controls, final long timeoutMillis) throws com.unboundid.ldap.sdk.LDAPException {
    if ((messageID) == (-1)) {
        messageID = connection.nextMessageID();
    }
    final com.unboundid.ldap.protocol.BindRequestProtocolOp protocolOp = new com.unboundid.ldap.protocol.BindRequestProtocolOp(bindDN, getSASLMechanismName(), saslCredentials);
    final com.unboundid.ldap.protocol.LDAPMessage requestMessage = new com.unboundid.ldap.protocol.LDAPMessage(messageID, protocolOp, controls);
    return sendMessage(connection, requestMessage, timeoutMillis);
}
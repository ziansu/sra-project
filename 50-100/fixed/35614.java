@java.lang.Override
public int next() throws javax.xml.stream.XMLStreamException {
    try {
        return super.next();
    } catch (javax.xml.stream.XMLStreamException e) {
        java.lang.Throwable cause = e.getCause();
        if (((returnSecurityError) || (initiator)) || ((cause != null) && ((cause.getCause()) instanceof org.apache.wss4j.common.WSSPolicyException))) {
            throw e;
        }
        throw new javax.xml.stream.XMLStreamException(new org.apache.wss4j.common.ext.WSSecurityException(WSSecurityException.ErrorCode.SECURITY_ERROR));
    }
}
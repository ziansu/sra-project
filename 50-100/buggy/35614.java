@java.lang.Override
public int next() throws javax.xml.stream.XMLStreamException {
    try {
        return super.next();
    } catch (javax.xml.stream.XMLStreamException e) {
        java.lang.Throwable cause = e.getCause();
        if (((returnSecurityError) || (initiator)) || ((cause != null) && ((cause.getCause()) instanceof org.apache.wss4j.common.WSSPolicyException))) {
            throw e;
        }
        java.lang.String safeErrorMessage = org.apache.wss4j.common.ext.WSSecurityException.UNIFIED_SECURITY_ERR;
        throw new javax.xml.stream.XMLStreamException(new org.apache.wss4j.common.ext.WSSecurityException(WSSecurityException.ErrorCode.SECURITY_ERROR, new java.lang.Exception(safeErrorMessage)));
    }
}
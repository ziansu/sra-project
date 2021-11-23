@java.lang.Override
public com.orientechnologies.orient.core.db.record.OIdentifiable denyUser(com.orientechnologies.orient.core.record.impl.ODocument iDocument, com.orientechnologies.orient.core.metadata.security.ORestrictedOperation iOperationType, java.lang.String iUserName) {
    return delegate.denyRole(iDocument, iOperationType, iUserName);
}
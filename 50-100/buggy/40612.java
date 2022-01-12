public com.orientechnologies.orient.core.metadata.security.OUser getUser(final com.orientechnologies.orient.core.id.ORID iRecordId) {
    com.orientechnologies.orient.core.record.impl.ODocument result;
    result = getDatabase().load(iRecordId, "roles:1");
    if (!(result.getClassName().equals(OUser.CLASS_NAME))) {
        result = null;
    }
    return new com.orientechnologies.orient.core.metadata.security.OUser(result);
}
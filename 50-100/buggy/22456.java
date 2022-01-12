@java.lang.Override
public com.evolveum.polygon.connector.sap.SyncToken getLatestSyncToken(com.evolveum.polygon.connector.sap.ObjectClass objectClass) {
    if (objectClass.is(ObjectClass.ACCOUNT_NAME)) {
        java.util.Calendar now = new java.util.GregorianCalendar();
        now.set(java.util.Calendar.MILLISECOND, 0);
        com.evolveum.polygon.connector.sap.SyncToken syncToken = new com.evolveum.polygon.connector.sap.SyncToken(now.getTime().getTime());
        com.evolveum.polygon.connector.sap.SapConnector.LOG.ok("returning SyncToken: {0} ({1})", syncToken, now);
        return syncToken;
    }else {
        throw new java.lang.UnsupportedOperationException(("Unsupported object class " + objectClass));
    }
}
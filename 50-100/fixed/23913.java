@java.lang.Override
public java.lang.Object convertObjectValueToDataValue(java.lang.Object objectValue, org.eclipse.persistence.sessions.Session session) {
    if (objectValue == null) {
        return null;
    }
    if (!(objectValue instanceof info.elexis.server.core.connector.elexis.jpa.model.annotated.AbstractDBObjectIdDeleted)) {
        log.warn(" {} is not an AbstractDBObject", objectValue.getClass());
        return null;
    }
    return StoreToStringService.INSTANCE.storeToString(((info.elexis.server.core.connector.elexis.jpa.model.annotated.AbstractDBObjectIdDeleted) (objectValue)));
}
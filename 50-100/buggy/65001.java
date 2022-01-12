@java.lang.Override
public <T extends org.xwiki.model.reference.EntityReference> T extractRef(org.xwiki.model.reference.EntityReference fromRef, T defaultRef, java.lang.Class<T> token) {
    org.xwiki.model.reference.EntityReference ref = null;
    if (fromRef != null) {
        ref = fromRef.extractReference(getEntityTypeMap().get(token));
    }
    if (ref != null) {
        return cloneRef(ref, token);
    }else {
        return com.google.common.base.Preconditions.checkNotNull(defaultRef);
    }
}
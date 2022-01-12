protected void loadInverseChildKeys(org.grails.datastore.mapping.core.Session session, java.lang.Class childType, java.util.Collection keys) {
    if (!(keys.isEmpty())) {
        if (proxyEntities) {
            for (java.lang.Object key : keys) {
                add(session.proxy(childType, ((java.io.Serializable) (key))));
            }
        }else {
            addAll(session.retrieveAll(childType, keys));
        }
    }
}
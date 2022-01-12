protected void deleteOrphans(final com.orientechnologies.orient.object.enhancement.OObjectProxyMethodHandler handler) {
    for (com.orientechnologies.orient.core.id.ORID orphan : handler.getOrphans()) {
        final com.orientechnologies.orient.core.record.impl.ODocument doc = orphan.getRecord();
        deleteCascade(doc);
        if (doc != null)
            underlying.delete(doc);
        
    }
    handler.getOrphans().clear();
}
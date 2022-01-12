private com.bagri.core.system.Collection getTypedCollection(com.bagri.core.system.Schema schema, java.lang.String typePath) {
    for (com.bagri.core.system.Collection collect : schema.getCollections()) {
        java.lang.String cPath = collect.getDocumentType();
        if ((cPath != null) && (typePath.equals(cPath))) {
            return collect;
        }
    }
    return null;
}
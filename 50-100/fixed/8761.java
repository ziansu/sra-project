private java.util.Collection getTypedCollection(com.bagri.core.system.Schema schema, java.lang.String typePath) {
    for (java.util.Collection collect : schema.getCollections()) {
        java.lang.String cPath = collect.getDocumentType();
        if ((cPath != null) && (typePath.equals(cPath))) {
            return collect;
        }
    }
    return null;
}
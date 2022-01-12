public java.util.List<java.lang.String> getTypeUris() {
    if ((typeUris) == null) {
        com.poemspace.dm4.CriteriaCache.log.info("reveal criteria type URIs");
        typeUris = new java.util.ArrayList<java.lang.String>();
        for (de.deepamehta.core.Topic type : getTypes()) {
            typeUris.add(type.getUri());
        }
    }
    return typeUris;
}
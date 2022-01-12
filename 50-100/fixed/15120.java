private java.lang.String getTypeName(org.forgerock.opendj.config.ManagedObjectDefinition<? extends C, ? extends S> d) {
    for (java.lang.String key : types.keySet()) {
        org.forgerock.opendj.config.ManagedObjectDefinition<? extends C, ? extends S> current = types.get(key);
        if (current.equals(d)) {
            return key;
        }
    }
    return d.getName();
}
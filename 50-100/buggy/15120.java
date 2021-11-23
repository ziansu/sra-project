private java.lang.String getTypeName(org.forgerock.opendj.config.ManagedObjectDefinition<? extends C, ? extends S> d) {
    java.lang.String name = d.getName();
    for (java.lang.String key : types.keySet()) {
        org.forgerock.opendj.config.ManagedObjectDefinition<? extends C, ? extends S> current = types.get(key);
        if (current.equals(d)) {
            name = key;
            break;
        }
    }
    return name;
}
private void registerSuperTypes(java.lang.Class type) {
    java.lang.Class<?> supertype = type.getSuperclass();
    while ((type != null) && (supertype != (java.lang.Object.class))) {
        if (types.containsKey(supertype)) {
            throw new java.lang.RuntimeException(("Ambigious Puppet for " + supertype));
        }
        types.put(supertype, type);
        type = ((type.getSuperclass()) == type) ? null : type.getSuperclass();
    } 
}
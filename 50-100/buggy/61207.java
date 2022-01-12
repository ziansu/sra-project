private void populateClassNameMapping(java.util.Set<java.lang.String> classNames) {
    java.util.Map<java.lang.String, java.lang.Class<?>> newMappings = new java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Class<?>>();
    synchronized(this.classNameMappings) {
        this.classNameMappings.clear();
        for (java.lang.String className : classNames) {
            this.classNameMappings.put(className, resolveClassFromName(className));
        }
    }
}
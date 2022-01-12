private void populateClassNameMapping(java.util.Set<java.lang.String> classNames) {
    synchronized(this.classNameMappings) {
        this.classNameMappings.clear();
        for (java.lang.String className : classNames) {
            this.classNameMappings.put(className, resolveClassFromName(className));
        }
    }
}
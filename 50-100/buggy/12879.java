private void checkAndAdd(java.util.Set<java.lang.String> classes, java.lang.String className) {
    for (java.lang.String excl : this.excludes) {
        if (excl.equals(className))
            return ;
        
        if (excl.endsWith(".*")) {
            java.lang.String baseName = excl.substring(0, ((excl.length()) - 1));
            if (className.startsWith(baseName))
                return ;
            
        }
    }
    classes.add(className);
}
public boolean excludesClass(java.lang.String classname) {
    if (classname == null)
        return false;
    
    for (java.lang.String excludePattern : getExcludedClasses()) {
        if (classname.matches(excludePattern))
            return true;
        
    }
    return false;
}
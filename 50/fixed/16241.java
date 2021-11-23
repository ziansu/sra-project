private boolean classContains(java.lang.String state) {
    java.lang.String className = getClassName();
    if ((className == null) || (state == null))
        return false;
    
    return className.contains(state);
}
private boolean classContains(java.lang.String state) {
    state = (state == null) ? "" : state;
    java.lang.String className = getClassName();
    return (className != null) && (className.contains(state));
}
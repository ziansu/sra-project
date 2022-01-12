public <T> java.util.Collection<T> getChildrenOfType(java.lang.Class<T> t) {
    return getChildrenOfType(this, t, new java.util.ArrayList<T>(), true);
}
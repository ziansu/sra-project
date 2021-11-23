public boolean exists(java.lang.String name) {
    return hasParent() ? (contains(name)) || (parent.exists(name)) : contains(name);
}
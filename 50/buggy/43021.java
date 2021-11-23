public boolean exists(java.lang.String name) {
    return hasParent() ? (contains(name)) || (parent.contains(name)) : contains(name);
}
private java.lang.String calcHashcode() {
    java.lang.StringBuilder hash = new java.lang.StringBuilder("__");
    for (org.jasig.portal.groups.IEntityGroup group : includes) {
        hash.append(group.getKey());
    }
    hash.append("^");
    for (org.jasig.portal.groups.IEntityGroup group : excludes) {
        hash.append(group.getKey());
    }
    hash.append("_#");
    return hash.toString();
}
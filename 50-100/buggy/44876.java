private java.lang.String calcHashcode() {
    java.lang.StringBuffer hash = new java.lang.StringBuffer("__");
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
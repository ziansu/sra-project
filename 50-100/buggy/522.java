private java.util.Set<java.lang.String> getUnion(java.util.Set<java.lang.String> s1, java.util.Set<java.lang.String> s2) {
    java.util.Set<java.lang.String> toReturn = new java.util.HashSet<java.lang.String>();
    toReturn.addAll(s1);
    toReturn.addAll(s2);
    return toReturn;
}
private static final boolean equalsNull(java.lang.Object o1, java.lang.Object o2) {
    if (o1 == null)
        return o2 == null;
    
    if (o2 == null)
        return false;
    
    return o1.equals(o2);
}
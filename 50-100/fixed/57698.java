private boolean contain(java.lang.Class<?> o, java.lang.String n) {
    boolean b = false;
    try {
        if ((o != null) && ((o.getSuperclass()) != (java.lang.Object.class))) {
            b = contain(o.getSuperclass(), n);
        }
        if ((!b) && (o != null))
            b = (o.getDeclaredField(n)) != null;
        
    } catch (java.lang.NoSuchFieldException | java.lang.SecurityException e) {
    }
    return b;
}
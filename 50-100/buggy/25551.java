protected static java.lang.reflect.Constructor findConstructor(java.lang.Class clazz, java.lang.Class[] pTypes) throws java.lang.NoSuchMethodException {
    java.lang.Class thisClass = clazz;
    java.lang.NoSuchMethodException ex = null;
    while (thisClass != (java.lang.Object.class)) {
        try {
            return thisClass.getDeclaredConstructor(pTypes);
        } catch (java.lang.NoSuchMethodException e) {
            ex = e;
            thisClass = thisClass.getSuperclass();
        }
    } 
    throw ex;
}
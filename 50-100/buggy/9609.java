private static org.glassfish.jersey.internal.util.ReflectionHelper.DeclaringClassInterfacePair getType(java.lang.Class<?> concrete, java.lang.Class<?> iface, java.lang.Class<?> c, java.lang.reflect.Type[] ts) {
    for (java.lang.reflect.Type t : ts) {
        org.glassfish.jersey.internal.util.ReflectionHelper.DeclaringClassInterfacePair p = org.glassfish.jersey.internal.util.ReflectionHelper.getType(concrete, iface, c, t);
        if (p != null) {
            return p;
        }
    }
    return null;
}
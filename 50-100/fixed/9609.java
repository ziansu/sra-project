private static org.glassfish.jersey.internal.util.ReflectionHelper.DeclaringClassInterfacePair getType(final java.lang.Class<?> concrete, final java.lang.Class<?> iface, final java.lang.Class<?> c, final java.lang.reflect.Type[] ts) {
    for (final java.lang.reflect.Type t : ts) {
        final org.glassfish.jersey.internal.util.ReflectionHelper.DeclaringClassInterfacePair p = org.glassfish.jersey.internal.util.ReflectionHelper.getType(concrete, iface, c, t);
        if (p != null) {
            return p;
        }
    }
    return null;
}
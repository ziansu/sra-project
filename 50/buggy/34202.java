public static java.lang.Object newInstance(java.lang.String name, java.lang.Object o) throws jvn.JvnException {
    return java.lang.reflect.Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), new jvn.JvnProxy(name, o));
}
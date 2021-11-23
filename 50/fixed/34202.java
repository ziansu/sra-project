public static java.lang.Object newInstance(java.lang.String name, java.lang.Class c) throws jvn.JvnException {
    return java.lang.reflect.Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), new jvn.JvnProxy(name, c));
}
public static <T> T createProxy(java.lang.Class<T> clazz, io.vertx.core.Vertx vertx, java.lang.String address) {
    java.lang.String proxyClassName = (clazz.getName()) + "VertxEBProxy";
    java.lang.Class<?> proxyClass = io.vertx.serviceproxy.ProxyHelper.loadClass(proxyClassName, clazz);
    java.lang.reflect.Constructor constructor = io.vertx.serviceproxy.ProxyHelper.getConstructor(proxyClass, io.vertx.core.Vertx.class, java.lang.String.class);
    java.lang.Object instance = io.vertx.serviceproxy.ProxyHelper.createInstance(constructor, vertx, address);
    return ((T) (instance));
}
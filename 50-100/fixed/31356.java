@java.lang.SuppressWarnings(value = "unchecked")
private <T> com.thesoftwarefactory.vertx.web.bind.Binder<T> newBinder(java.lang.String className, java.lang.reflect.Type type) {
    try {
        java.lang.Class<com.thesoftwarefactory.vertx.web.bind.Binder<?>> cls = ((java.lang.Class<com.thesoftwarefactory.vertx.web.bind.Binder<?>>) (java.lang.Class.forName(className)));
        return newBinder(cls, type);
    } catch (java.lang.Throwable t) {
        com.thesoftwarefactory.vertx.web.bind.impl.BindersImpl.logger.log(java.util.logging.Level.WARNING, ("Could not instantiate binder class " + className));
    }
    return null;
}
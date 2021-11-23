public static <E> E createProjection(E wrapped, java.lang.Class<?> projection) {
    return ((E) (org.springframework.cglib.proxy.Enhancer.create(wrapped.getClass(), new org.dspace.app.rest.projection.RestProjectionFactory(wrapped, projection))));
}
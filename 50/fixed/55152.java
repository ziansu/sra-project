public java.lang.String addInterceptor(com.hazelcast.map.MapInterceptor interceptor) {
    java.lang.String id = interceptor.getClass().getName();
    addInterceptor(id, interceptor);
    return id;
}
public void addInterceptor(java.lang.String id, com.hazelcast.map.MapInterceptor interceptor) {
    interceptorMap.put(id, interceptor);
    interceptors.add(interceptor);
}
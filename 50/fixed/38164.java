public java.util.Set<java.lang.Object> getSingletons() {
    if (singletons.isEmpty()) {
        singletons.add(new org.jboss.resteasy.test.providers.sse.SseResource());
    }
    return singletons;
}
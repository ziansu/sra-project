public <P, R> void registerOneToMany(java.lang.String method, java.lang.Class<P> pClass, java.lang.Class<R> rClass, java.util.function.BiFunction<java.lang.String, P, java.util.List<R>> biFunction) {
    mustNotBeRegistered(method);
    methodToCategory.put(method, org.eclipse.che.api.core.jsonrpc.commons.RequestHandlerManager.Category.ONE_TO_MANY);
    oneToManyHandlers.put(method, new org.eclipse.che.api.core.jsonrpc.commons.RequestHandlerManager.OneToManyHandler<>(pClass, rClass, biFunction));
}
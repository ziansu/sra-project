@java.lang.Override
public com.navercorp.pinpoint.bootstrap.interceptor.scope.InterceptorScope getInterceptorScope(java.lang.String name) {
    if (name == null) {
        throw new java.lang.NullPointerException("name must not be null");
    }
    return interceptorScopePool.add(name);
}
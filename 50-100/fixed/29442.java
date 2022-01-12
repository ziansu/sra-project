@java.lang.Override
protected void configure() {
    bindInterceptor(com.google.inject.matcher.Matchers.any(), com.google.inject.matcher.Matchers.annotatedWith(io.github.resilience4j.ratpack.annotation.CircuitBreaker.class), injected(new io.github.resilience4j.ratpack.internal.CircuitBreakerMethodInterceptor()));
    bindInterceptor(com.google.inject.matcher.Matchers.any(), com.google.inject.matcher.Matchers.annotatedWith(io.github.resilience4j.ratpack.annotation.RateLimiter.class), injected(new io.github.resilience4j.ratpack.internal.RateLimiterMethodInterceptor()));
}
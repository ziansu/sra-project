C getSharedCircuitBreakerCommand(com.netflix.hystrix.HystrixCommandProperties.ExecutionIsolationStrategy isolationStrategy, com.netflix.hystrix.HystrixCircuitBreakerTest.TestCircuitBreaker circuitBreaker) {
    return getCommand(isolationStrategy, ExecutionResult.FAILURE, 0, FallbackResult.SUCCESS, circuitBreaker, null, 100, CacheEnabled.NO, "foo", 10);
}
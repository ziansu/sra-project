C getCircuitOpenCommand(com.netflix.hystrix.HystrixCommandProperties.ExecutionIsolationStrategy isolationStrategy, com.netflix.hystrix.AbstractTestHystrixCommand.FallbackResult fallbackResult) {
    com.netflix.hystrix.HystrixCircuitBreakerTest.TestCircuitBreaker openCircuit = new com.netflix.hystrix.HystrixCircuitBreakerTest.TestCircuitBreaker().setForceShortCircuit(true);
    return getCommand(isolationStrategy, ExecutionResult.SUCCESS, 0, fallbackResult, 0, openCircuit, null, 100, CacheEnabled.NO, "foo", 10, 10, false);
}
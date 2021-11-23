@java.lang.Override
public C call() {
    return getCommand(ExecutionIsolationStrategy.THREAD, ExecutionResult.SUCCESS, 0, FallbackResult.UNIMPLEMENTED, new com.netflix.hystrix.HystrixCircuitBreakerTest.TestCircuitBreaker(), null, 100, CacheEnabled.YES, 42, 10);
}
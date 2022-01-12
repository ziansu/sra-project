public static com.codahale.metrics.health.HealthCheck.Result healthy(java.lang.String message) {
    return new com.codahale.metrics.health.HealthCheck.Result(true, message, null);
}
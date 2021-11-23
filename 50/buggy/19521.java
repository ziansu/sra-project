public static com.codahale.metrics.health.HealthCheck.Result unhealthy(java.lang.String message) {
    return new com.codahale.metrics.health.HealthCheck.ResultBuilder(false).withMessage(message).build();
}
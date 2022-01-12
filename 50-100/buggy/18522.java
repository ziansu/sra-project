public github.jschmidt10.survivor.RestResponse handle(github.jschmidt10.survivor.api.Pool pool, com.amazonaws.services.lambda.runtime.Context context) {
    com.amazonaws.services.lambda.runtime.LambdaLogger logger = context.getLogger();
    try {
        boolean result = execute(pool);
        return result ? github.jschmidt10.survivor.RestResponse.success("Pool created.") : github.jschmidt10.survivor.RestResponse.failure("Could not execute pool.");
    } catch (java.lang.Exception e) {
        logException(logger, e);
        return github.jschmidt10.survivor.RestResponse.failure(e.getMessage());
    }
}
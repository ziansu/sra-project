public github.jschmidt10.survivor.RestResponse handle(github.jschmidt10.survivor.api.Pool pool, com.amazonaws.services.lambda.runtime.Context context) {
    com.amazonaws.services.lambda.runtime.LambdaLogger logger = context.getLogger();
    try {
        if (execute(pool)) {
            return github.jschmidt10.survivor.RestResponse.success(pool);
        }else {
            return github.jschmidt10.survivor.RestResponse.failure("Could not execute pool.");
        }
    } catch (java.lang.Exception e) {
        logException(logger, e);
        return github.jschmidt10.survivor.RestResponse.failure(e.getMessage());
    }
}
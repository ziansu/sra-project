private step.grid.io.OutputMessage execute(java.lang.String function, javax.json.JsonObject argument, java.util.Map<java.lang.String, java.lang.String> properties, step.handlers.javahandler.SimpleJavaHandler handler) {
    step.grid.io.InputMessage input = new step.grid.io.InputMessage();
    input.setFunction(function);
    input.setArgument(argument);
    input.setProperties(properties);
    try {
        return handler.handle(token, input);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}
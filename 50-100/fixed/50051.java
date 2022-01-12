@java.lang.Override
public void accept(graphql.execution.DataFetcherExceptionHandlerParameters handlerParameters) {
    java.lang.Throwable exception = handlerParameters.getException();
    graphql.language.SourceLocation sourceLocation = handlerParameters.getField().getSourceLocation();
    graphql.execution.ExecutionPath path = handlerParameters.getPath();
    graphql.ExceptionWhileDataFetching error = new graphql.ExceptionWhileDataFetching(path, exception, sourceLocation);
    handlerParameters.getExecutionContext().addError(error, handlerParameters.getPath());
    graphql.execution.SimpleDataFetcherExceptionHandler.log.warn(error.getMessage(), exception);
}
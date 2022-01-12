<T> T validate(graphql.execution.ExecutionPath path, T result) throws graphql.execution.NonNullableFieldWasNullException {
    if (result == null) {
        if (typeInfo.isNonNullType()) {
            graphql.execution.NonNullableFieldWasNullException nonNullException = new graphql.execution.NonNullableFieldWasNullException(typeInfo, path);
            executionContext.addError(nonNullException, path);
            throw nonNullException;
        }
    }
    return result;
}
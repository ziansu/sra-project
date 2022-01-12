public static <ResultType> ResultType fromInputStream(java.io.InputStream inputStream, java.util.function.Function<java.io.InputStream, ResultType> inputStreamReader) {
    if (inputStream == null) {
        return null;
    }
    try (com.asprotunity.queryiteasy.scope.AutoCloseableScope scope = new com.asprotunity.queryiteasy.scope.AutoCloseableScope()) {
        scope.add(inputStream::close);
        return inputStreamReader.apply(inputStream);
    }
}
public static <ResultType> ResultType fromReader(java.io.Reader reader, java.util.function.Function<java.io.Reader, ResultType> inputStreamReader) {
    if (reader == null) {
        return null;
    }
    try (com.asprotunity.queryiteasy.scope.AutoCloseableScope scope = new com.asprotunity.queryiteasy.scope.AutoCloseableScope()) {
        scope.add(reader::close);
        return inputStreamReader.apply(reader);
    }
}
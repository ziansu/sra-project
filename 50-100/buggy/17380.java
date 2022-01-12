private static <T> java.util.List<java.lang.Object> createStructuralValues(com.google.cloud.dataflow.sdk.coders.Coder<T> coder, java.util.List<T> list) throws java.lang.Exception {
    java.util.List<java.lang.Object> result = new java.util.ArrayList<>();
    for (T elem : list) {
        result.add(coder.structuralValue(elem));
    }
    return result;
}
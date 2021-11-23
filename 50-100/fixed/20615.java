public static java.util.ArrayList<java.lang.Double> doubleVectorFromINDArray(org.nd4j.linalg.api.ndarray.INDArray values) {
    java.util.ArrayList<java.lang.Double> result = new java.util.ArrayList<java.lang.Double>(values.size(0));
    for (int i = 0; i < (values.length()); i++) {
        result.add(values.getDouble(0, i));
    }
    return result;
}
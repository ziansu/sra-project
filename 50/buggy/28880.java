public double[] getMeanRelError() {
    if ((meanRelError) == null) {
        throw new java.lang.RuntimeException("Object not initialized correctly. Call calculateErrorStats(..) first!");
    }
    return meanRelError.clone();
}
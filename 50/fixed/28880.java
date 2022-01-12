public double[] getMeanRelError() {
    if ((this.meanRelError) == null) {
        throw new java.lang.RuntimeException("Object not initialized correctly. Call calculateErrorStats(..) first!");
    }
    return this.meanRelError.clone();
}
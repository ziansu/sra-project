public java.lang.Object getPrediction() {
    net.sf.javaml.core.Instance instance = new net.sf.javaml.core.DenseInstance(this.testing.getRawValues());
    java.lang.Object prediction = knn.classify(instance);
    return ranges[((int) ((double) (prediction)))];
}
private double accumulateGradient(com.yahoo.labs.yamall.core.Instance sample) {
    (gatherGradIter)++;
    double pred = predict(sample);
    final double grad = lossFnc.negativeGradient(pred, sample.getLabel(), sample.getWeight());
    if ((java.lang.Math.abs(grad)) > 1.0E-8) {
        sample.getVector().addScaledSparseVectorToDenseVector(Gbatch, grad);
    }
    return pred;
}
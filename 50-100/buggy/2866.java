private org.ejml.simple.SimpleSVD svd(final org.ejml.simple.SimpleMatrix x, final double[] sdevs) {
    final double nsqrt = java.lang.Math.sqrt(_N);
    for (int i = 0; i < (sdevs.length); i++) {
        x.extractVector(false, i).divide(((sdevs[i]) * nsqrt));
    }
    return x.svd();
}
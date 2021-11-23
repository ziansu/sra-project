@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray scal(double alpha, org.nd4j.linalg.api.ndarray.INDArray x) {
    return org.nd4j.linalg.jcublas.SimpleJCublas.scal(alpha, x.linearView());
}
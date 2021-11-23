@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray scal(float alpha, org.nd4j.linalg.api.ndarray.INDArray x) {
    org.nd4j.linalg.jcublas.SimpleJCublas.scal(alpha, x.linearView());
    return x;
}
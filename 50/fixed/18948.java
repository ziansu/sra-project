@java.lang.Override
public org.nd4j.linalg.api.ndarray.INDArray axpy(float da, org.nd4j.linalg.api.ndarray.INDArray dx, org.nd4j.linalg.api.ndarray.INDArray dy) {
    org.nd4j.linalg.jcublas.SimpleJCublas.axpy(da, dx, dy);
    return dy;
}
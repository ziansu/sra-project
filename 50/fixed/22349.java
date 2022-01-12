@java.lang.Override
protected int icamax(int N, org.nd4j.linalg.api.complex.IComplexNDArray X, int incX) {
    return (org.jblas.NativeBlas.icamax(N, getFloatData(X), org.nd4j.linalg.api.blas.BlasBufferUtil.getBlasOffset(X), incX)) - 1;
}
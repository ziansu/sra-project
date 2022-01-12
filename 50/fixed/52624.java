@java.lang.Override
public org.nd4j.linalg.api.complex.IComplexNDArray scal(org.nd4j.linalg.api.complex.IComplexDouble alpha, org.nd4j.linalg.api.complex.IComplexNDArray x) {
    return org.nd4j.linalg.jcublas.SimpleJCublas.scal(alpha, x);
}
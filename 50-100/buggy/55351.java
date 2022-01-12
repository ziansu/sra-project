@java.lang.Override
public org.nd4j.linalg.api.complex.IComplexNDArray axpy(org.nd4j.linalg.api.complex.IComplexNumber da, org.nd4j.linalg.api.complex.IComplexNDArray dx, org.nd4j.linalg.api.complex.IComplexNDArray dy) {
    if (da instanceof org.nd4j.linalg.api.complex.IComplexDouble) {
        org.nd4j.linalg.jcublas.SimpleJCublas.axpy(((org.nd4j.linalg.api.complex.IComplexDouble) (da)), dx.linearView(), dy.linearView());
    }else
        org.nd4j.linalg.jcublas.SimpleJCublas.axpy(((org.nd4j.linalg.api.complex.IComplexFloat) (da)), dx.linearView(), dy.linearView());
    
    return dy;
}
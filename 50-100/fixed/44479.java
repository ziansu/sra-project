public static boolean or(org.nd4j.linalg.api.complex.IComplexNDArray n, org.nd4j.linalg.indexing.conditions.Condition cond) {
    boolean ret = false;
    org.nd4j.linalg.api.complex.IComplexNDArray linear = n.linearView();
    for (int i = 0; i < (linear.length()); i++) {
        ret = ret || (cond.apply(linear.getComplex(i)));
    }
    return ret;
}
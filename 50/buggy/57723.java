private boolean testValidatorWithoutFeatureNames(java.lang.String constraint) {
    org.prop4j.NodeReader n = new org.prop4j.NodeReader();
    return n.isWellFormed(constraint);
}
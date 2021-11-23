protected float[] computeDeformationContribution(float[] thispt) {
    float[] result = new float[ndims];
    computeDeformationContribution(thispt, result);
    return result;
}
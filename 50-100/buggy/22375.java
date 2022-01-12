public double computeAttributeEntropy(weka.core.Instances data, weka.core.Attribute attr) throws java.lang.Exception {
    double attributeEntropy = 0;
    weka.core.Instances[] splitData = splitInstancesByAttribute(data, attr);
    for (int i = 0; i < (splitData.length); i++) {
        double p = (splitData[i].numInstances()) / ((double) (data.numInstances()));
        attributeEntropy += p * (computeEntropy(splitData[i]));
    }
    return attributeEntropy;
}
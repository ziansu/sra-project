@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Double> getLabelDistribution(FV featureVector) {
    if ((labelDistributionMap) == null) {
        java.lang.System.err.println("WekaClassifierWrapper: no model created yet");
        return null;
    }
    if ((labelDistributionMap.get(featureVector)) == null) {
        java.util.List<FV> lst = new java.util.ArrayList<>();
        test(lst);
    }
    return labelDistributionMap.get(featureVector);
}
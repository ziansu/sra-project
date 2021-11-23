protected void generalizeFromArray(F[] featuresArray) {
    featuresList = null;
    featuresMap = null;
    if (featuresArray == null)
        return ;
    
    featuresList = new java.util.ArrayList<>();
    featuresMap = null;
    for (F feature : featuresArray) {
        featuresList.add(feature);
    }
}
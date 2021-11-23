protected void generalizeFromArray(F[] featuresArray) {
    featuresList = null;
    featuresMap = null;
    if (featuresArray == null)
        return ;
    
    featuresList = new java.util.ArrayList<>();
    featuresMap = new java.util.HashMap<>();
    for (F feature : featuresArray) {
        featuresList.add(feature);
        if ((feature != null) && ((feature.getFeatureName()) != null))
            featuresMap.put(feature.getFeatureName(), feature);
        
    }
}
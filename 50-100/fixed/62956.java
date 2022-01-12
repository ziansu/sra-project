private java.util.List<org.phenotips.data.Feature> filterFeaturesByPresentStatus(java.util.Set<? extends org.phenotips.data.Feature> features, java.lang.Boolean status) {
    java.util.List<org.phenotips.data.Feature> filteredFeatures = new java.util.LinkedList<>();
    for (org.phenotips.data.Feature feature : features) {
        if ((feature.isPresent()) == status) {
            filteredFeatures.add(0, feature);
        }
    }
    return filteredFeatures;
}
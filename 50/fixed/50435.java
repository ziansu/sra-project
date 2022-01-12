public static double getInteractorsThreshold(java.lang.String resource) {
    java.lang.Double threshold = org.reactome.web.diagram.data.InteractorsContent.interactorsThreshold.get(resource.toLowerCase());
    if (threshold == null) {
        threshold = 0.5;
        org.reactome.web.diagram.data.InteractorsContent.setInteractorsThreshold(resource, threshold);
    }
    return threshold;
}
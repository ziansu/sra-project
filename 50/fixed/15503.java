public static double[] extract(org.genku.touchauth.Model.TouchEvent event) {
    if (event == null)
        return null;
    
    if ((event.midData.length) <= 1) {
        return org.genku.touchauth.Model.FeatureExtraction.extractClickEvent(event);
    }
    return org.genku.touchauth.Model.FeatureExtraction.extractSlideEvent(event);
}
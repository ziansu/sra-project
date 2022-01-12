@java.lang.SuppressWarnings(value = "serial")
private java.util.List<interfaces.Feature> getFeatures() {
    return new java.util.ArrayList<interfaces.Feature>() {
        {
            add(getStopWordFeature());
        }
    };
}
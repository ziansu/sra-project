public static jsymbolic2.featureutils.MIDIFeatureExtractor[] getAllAvailableFeatureExtractors(java.util.LinkedList<java.lang.Boolean> defaults) {
    if (defaults == null) {
        defaults = new java.util.LinkedList<java.lang.Boolean>();
    }
    boolean[] defaultArray = jsymbolic2.featureutils.FeatureExtractorAccess.getDefaultFeaturesToSave();
    for (boolean b : defaultArray) {
        defaults.add(b);
    }
    return jsymbolic2.featureutils.FeatureExtractorAccess.getAllImplementedFeatureExtractors();
}
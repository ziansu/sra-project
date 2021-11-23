public void addFeatures(java.util.List<de.tudarmstadt.ukp.dkpro.tc.api.features.Feature> features) {
    java.util.List<de.tudarmstadt.ukp.dkpro.tc.api.features.Feature> featTmp = new java.util.ArrayList<de.tudarmstadt.ukp.dkpro.tc.api.features.Feature>();
    for (de.tudarmstadt.ukp.dkpro.tc.api.features.Feature f : this.features) {
        featTmp.add(f);
    }
    featTmp.addAll(features);
    this.features = featTmp.toArray(new de.tudarmstadt.ukp.dkpro.tc.api.features.Feature[0]);
}
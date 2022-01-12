public void setSelectedStandaloneFeatures(final de.cismet.cismap.commons.featureservice.AbstractFeatureService service, final java.util.List<de.cismet.cismap.commons.features.Feature> featureList) {
    selectedStandaloneFeatures.put(service, featureList);
    final de.cismet.cismap.commons.gui.attributetable.AttributeTable table = consideredAttributeTables.get(service);
    if (table != null) {
        table.applySelection(this, featureList, true);
    }
    syncWithMap.add(service);
    refreshSelectedFeatureCounts();
}
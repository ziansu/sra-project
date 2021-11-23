private void changeType(boolean isFeatures) {
    com.google.gwt.core.client.JsArrayMixed data = getData(isFeatures);
    int[] region = (isFeatures) ? geneWithFeaturesRegion : geneRegion;
    zoomLabel.setHTML((((("<b>" + (region[0])) + "</b> - <b>") + (region[1])) + "</b>"));
    geneviewer.setViewRegion(region[0], region[1]);
    geneviewer.setGeneData(data);
}
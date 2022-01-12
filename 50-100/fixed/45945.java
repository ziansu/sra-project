public void integrateTokensFeatures() {
    for (int actualRow : lineDefaultFeatures.keySet()) {
        for (int desideredRow : rowColumns.keySet()) {
            java.util.List<eu.fbk.dh.jamcha.feature.FeatureInfo> lineRenamedFeatures = getLineFeatures((actualRow + desideredRow), actualRow);
            if (lineRenamedFeatures != null) {
                lineFeatures.get(actualRow).addAll(lineRenamedFeatures);
            }
        }
    }
}
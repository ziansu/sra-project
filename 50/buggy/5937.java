@java.lang.Override
protected void updateProperties() {
    setEnabled(isThereAtLeastOneFeatureThatHasChildren());
    setChecked(isEveryFeatureCollapsed());
}
public java.util.List<xstampp.model.AbstractLTLProvider> fetchSafetyConstraintsAs() {
    java.util.List<xstampp.model.AbstractLTLProvider> tempSafetyConstraints = new java.util.ArrayList<xstampp.model.AbstractLTLProvider>();
    tempSafetyConstraints = dataModel.getAllScenarios(true, false, false);
    return tempSafetyConstraints;
}
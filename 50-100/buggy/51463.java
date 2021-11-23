public java.util.List<java.lang.String> fetchSafetyConstraints() {
    java.util.List<java.lang.String> safetyconstraints = new java.util.ArrayList<java.lang.String>();
    java.util.List<xstampp.model.AbstractLTLProvider> tempSafetyConstraints = new java.util.ArrayList<xstampp.model.AbstractLTLProvider>();
    tempSafetyConstraints = dataModel.getAllScenarios(false, true, false);
    for (xstampp.model.AbstractLTLProvider sc : tempSafetyConstraints) {
        if (sc != null) {
            safetyconstraints.add(sc.getRefinedSafetyConstraint());
        }
    }
    return safetyconstraints;
}
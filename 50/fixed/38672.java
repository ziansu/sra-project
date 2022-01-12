private double getInfectionTime(double min, double max, dr.evomodel.epidemiology.casetocase.AbstractCase infected) {
    final double branchLength = max - min;
    return min + (branchLength * (1 - (infected.getInfectionBranchPosition().getParameterValue(0))));
}
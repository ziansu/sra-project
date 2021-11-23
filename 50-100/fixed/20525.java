protected boolean isFulfilled(org.deidentifier.arx.framework.check.groupify.HashGroupifyDistribution distribution) {
    org.deidentifier.arx.risk.RiskModelPopulationBasedUniquenessRisk riskModel = new org.deidentifier.arx.risk.RiskModelPopulationBasedUniquenessRisk(this.populationModel, distribution.getEquivalenceClasses(), distribution.getNumberOfTuples());
    double populationUniques = riskModel.getFractionOfUniqueTuples(this.statisticalModel);
    if ((populationUniques > 0.0) && (populationUniques <= (getRiskThreshold()))) {
        return true;
    }else
        if ((populationUniques == 0.0) && ((distribution.getFractionOfTuplesInClassesOfSize(1)) == 0.0)) {
            return true;
        }else {
            return false;
        }
    
}
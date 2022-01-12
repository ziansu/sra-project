public double getTestAdjustedComplianceProbability(double probability, java.lang.String test) {
    double result = probability;
    if (test.equals("FOBT")) {
        result = 1 - (java.lang.Math.pow((1 - probability), (1.0 / 4.0)));
        org.renci.epi.util.stats.ComplianceModel.logger.debug(("-------------------> " + result));
    }else {
        result = 1 - (java.lang.Math.pow((1 - probability), (10.0 / 4.0)));
        org.renci.epi.util.stats.ComplianceModel.logger.debug(("-------------------> " + result));
    }
    return result;
}
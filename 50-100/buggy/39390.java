private java.util.Set<com.globex.model.entity.common.RateRequirement> getRateRequirements(java.util.Set<com.globex.model.vo.common.RateRequirementDO> rateRequirementDOs, com.globex.model.entity.common.Country country) {
    if ((rateRequirementDOs != null) && (!(rateRequirementDOs.isEmpty()))) {
        java.util.Set<com.globex.model.entity.common.RateRequirement> rateRequirements = new java.util.HashSet<com.globex.model.entity.common.RateRequirement>();
        for (com.globex.model.vo.common.RateRequirementDO rateRequirementDO : rateRequirementDOs) {
            com.globex.model.entity.common.RateRequirement rateRequirement = rateRequirementDO.value();
            rateRequirement.setCountry(country);
            rateRequirements.add(rateRequirement);
        }
        return rateRequirements;
    }
    return null;
}
private java.util.List<com.globex.model.entity.common.RateRequirement> getRateRequirements(java.util.List<com.globex.model.vo.common.RateRequirementDO> rateRequirementDOs, com.globex.model.entity.common.Country country) {
    if ((rateRequirementDOs != null) && (!(rateRequirementDOs.isEmpty()))) {
        java.util.List<com.globex.model.entity.common.RateRequirement> rateRequirements = new java.util.ArrayList<com.globex.model.entity.common.RateRequirement>();
        for (com.globex.model.vo.common.RateRequirementDO rateRequirementDO : rateRequirementDOs) {
            com.globex.model.entity.common.RateRequirement rateRequirement = rateRequirementDO.value();
            rateRequirement.setCountry(country);
            rateRequirements.add(rateRequirement);
        }
        return rateRequirements;
    }
    return null;
}
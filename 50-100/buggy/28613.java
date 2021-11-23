@com.hserv.coordinatedentry.housinginventory.annotation.APIMapping(value = "CREATE_HOUSING_INVENTORIES")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{projectId}/eligibilityrequirements", method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<com.hserv.coordinatedentry.housinginventory.model.EligibilityRequirementModel> createEligibility(@org.springframework.web.bind.annotation.PathVariable
java.util.UUID projectId, @javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
com.hserv.coordinatedentry.housinginventory.model.EligibilityRequirementModel eligibilityModel, javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    com.hserv.coordinatedentry.housinginventory.domain.EligibilityRequirement eligibility = new com.hserv.coordinatedentry.housinginventory.domain.EligibilityRequirement();
    eligibility.setEligibilityId(java.util.UUID.randomUUID());
    eligibility.setProjectId(projectId);
    eligibility.setEligibility(com.hserv.coordinatedentry.housinginventory.web.rest.util.JsonUtil.toJSON(eligibilityModel));
    housingUnitEligibilityRepository.save(eligibility);
    com.hserv.coordinatedentry.housinginventory.model.EligibilityRequirementModel lresult = new com.hserv.coordinatedentry.housinginventory.model.EligibilityRequirementModel();
    lresult.setEligibiityRequirementId(eligibility.getEligibilityId());
    return new org.springframework.http.ResponseEntity<com.hserv.coordinatedentry.housinginventory.model.EligibilityRequirementModel>(lresult, org.springframework.http.HttpStatus.OK);
}
@org.springframework.web.bind.annotation.RequestMapping(value = "/{policyId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.teraproc.jaguar.rest.json.PolicyJson> getPolicy(@org.springframework.web.bind.annotation.ModelAttribute(value = "user")
com.teraproc.jaguar.domain.JaguarUser user, @org.springframework.web.bind.annotation.PathVariable
long applicationId, @org.springframework.web.bind.annotation.PathVariable
long policyId) {
    return createPolicyResponse(policyService.getPolicy(user, applicationId, policyId), HttpStatus.OK);
}
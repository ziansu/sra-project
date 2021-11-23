@org.springframework.security.access.prepost.PreAuthorize(value = "hasAuthority('EMPLOYER')")
@com.techlooper.controller.RequestMapping(value = "/challenges/{challengeId}/registrants", method = RequestMethod.POST)
public java.util.Set<com.techlooper.entity.ChallengeRegistrantDto> getRegistrantsById(@com.techlooper.controller.PathVariable
java.lang.Long challengeId, @com.techlooper.controller.RequestBody
com.techlooper.controller.RegistrantFilterCondition condition, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.text.ParseException {
    java.lang.String owner = request.getRemoteUser();
    if (challengeService.isOwnerOfChallenge(owner, challengeId)) {
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        return null;
    }
    condition.setAuthorEmail(owner);
    return challengeService.findRegistrantsByOwner(condition);
}
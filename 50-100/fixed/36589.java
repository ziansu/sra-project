@org.springframework.web.bind.annotation.RequestMapping(value = "review-data/distribution/get", method = org.springframework.web.bind.annotation.RequestMethod.POST, headers = ACCEPT_JSON)
@org.springframework.security.access.prepost.PreAuthorize(value = "@permissionEvaluator.hasPermission(principal, 'VIEW_SYNCHRONIZED_DATA, EDIT_SYNCHRONIZED_DATA')")
public org.springframework.http.ResponseEntity<org.openlmis.web.response.OpenLmisResponse> getDistribution(@org.springframework.web.bind.annotation.RequestBody
org.openlmis.distribution.domain.Distribution distribution, javax.servlet.http.HttpServletRequest request) {
    org.openlmis.web.response.OpenLmisResponse openLmisResponse = new org.openlmis.web.response.OpenLmisResponse("distribution", distributionService.getDistribution(distribution, loggedInUserId(request), new org.openlmis.distribution.domain.DistributionDataFilter(true), true));
    openLmisResponse.addData(org.openlmis.web.response.OpenLmisResponse.SUCCESS, messageService.message("message.distribution.created.success", distribution.getDeliveryZone().getName(), distribution.getProgram().getName(), distribution.getPeriod().getName()));
    return openLmisResponse.response(org.springframework.http.HttpStatus.OK);
}
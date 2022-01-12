public org.egov.workflow.web.contract.PositionHierarchyResponse getByPositionByComplaintTypeAndFromPosition(final java.lang.Long fromPosition, final java.lang.String serviceCode, final java.lang.String tenantId) {
    org.egov.workflow.web.contract.RequestInfoWrapper wrapper = org.egov.workflow.web.contract.RequestInfoWrapper.builder().RequestInfo(org.egov.common.contract.request.RequestInfo.builder().build()).build();
    return restTemplate.postForObject(positionHierarchyUrl, wrapper, org.egov.workflow.web.contract.PositionHierarchyResponse.class, fromPosition, serviceCode, tenantId);
}
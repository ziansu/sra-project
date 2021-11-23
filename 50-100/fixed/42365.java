public void deleteIssue(java.lang.Long issueId) {
    org.springframework.util.MultiValueMap<java.lang.String, java.lang.String> params = new org.springframework.util.LinkedMultiValueMap<java.lang.String, java.lang.String>();
    params.set("collectorId", collectorId);
    org.springframework.web.util.UriComponentsBuilder builder = org.springframework.web.util.UriComponentsBuilder.fromHttpUrl(((mirrorGateUrl) + (com.bbva.arq.devops.ae.mirrorgate.collectors.jira.api.SprintService.MIRROR_GATE_HANDLE_ISSUE_ENDPOINT))).queryParams(params);
    restTemplate.delete(builder.build().toUriString(), issueId);
}
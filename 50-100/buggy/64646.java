public org.springframework.http.ResponseEntity<java.util.List> sendIssues(java.util.List<com.bbva.arq.devops.ae.mirrorgate.core.dto.IssueDTO> issues) {
    org.springframework.util.MultiValueMap<java.lang.String, java.lang.String> params = new org.springframework.util.LinkedMultiValueMap<java.lang.String, java.lang.String>();
    params.set("collectorId", collectorId);
    org.springframework.web.util.UriComponentsBuilder builder = org.springframework.web.util.UriComponentsBuilder.fromHttpUrl(((mirrorGateUrl) + (com.bbva.arq.devops.ae.mirrorgate.collectors.jira.api.SprintService.MIRROR_GATE_SEND_ISSUES_ENDPOINT))).queryParams(params);
    return restTemplate.postForEntity(builder.toUriString(), issues, java.util.List.class);
}
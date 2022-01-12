@java.lang.Override
public org.springframework.http.ResponseEntity findByType(java.lang.String type, java.lang.Integer page, java.lang.Integer size, java.lang.String sortOrder, java.lang.String sortBy, net.smartcosmos.security.user.SmartCosmosUser user) {
    try {
        return restTemplate.findByType(type, page, size);
    } catch (org.springframework.web.client.HttpClientErrorException e) {
        return org.springframework.http.ResponseEntity.status(e.getStatusCode()).headers(e.getResponseHeaders()).body(e.getResponseBodyAsString());
    }
}
public org.venice.piazza.idam.util.ResponseEntity<java.lang.String> getUserProfile(final java.lang.String accessToken, final org.springframework.web.client.RestTemplate restTemplate) throws org.springframework.web.client.HttpClientErrorException, org.springframework.web.client.HttpServerErrorException {
    org.venice.piazza.idam.util.HttpHeaders headers = new org.venice.piazza.idam.util.HttpHeaders();
    headers.set(org.venice.piazza.idam.util.GxOAuthClient.AUTHORIZATION, ("Bearer " + accessToken));
    java.lang.System.out.println(("restTemplate: " + restTemplate));
    org.venice.piazza.idam.util.ResponseEntity<java.lang.String> profileResponse = new org.venice.piazza.idam.util.ResponseEntity(restTemplate.exchange(getProfileRequestUrl(), HttpMethod.GET, new org.venice.piazza.idam.util.HttpEntity("parameters", headers), java.lang.String.class).getBody(), HttpStatus.OK);
    return profileResponse;
}
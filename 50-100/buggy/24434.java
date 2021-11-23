public void unregisterApplication(java.lang.String internalAppId) {
    java.lang.String webServiceUrl = ((serviceProfile.getServiceApiUrl()) + "/") + internalAppId;
    de.fhg.fokus.nubomedia.paas.VNFRServiceImpl.logger.info(("unregistering application " + webServiceUrl));
    org.springframework.http.ResponseEntity<java.lang.Void> response = restTemplate.exchange(webServiceUrl, HttpMethod.DELETE, null, java.lang.Void.class);
    java.lang.Void body = response.getBody();
}
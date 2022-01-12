public void sendHeartBeat(java.lang.String internalAppId) {
    java.lang.String webServiceUrl = (((serviceProfile.getServiceApiUrl()) + "/") + internalAppId) + "/heartbeat";
    de.fhg.fokus.nubomedia.paas.VNFRServiceImpl.logger.info(("sending heartbeat to EMM " + webServiceUrl));
    org.springframework.http.ResponseEntity<java.lang.Void> response = restTemplate.exchange(webServiceUrl, HttpMethod.PUT, null, java.lang.Void.class);
    response.getBody();
    de.fhg.fokus.nubomedia.paas.VNFRServiceImpl.logger.info(("response :" + response));
}
public void deletePeerProductData(final io.subutai.hub.share.dto.PeerProductDataDto peerProductDataDto) throws java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException {
    java.lang.String removePath = getProductProcessUrl(configManager.getPeerId(), peerProductDataDto.getProductId());
    org.apache.cxf.jaxrs.client.WebClient client = configManager.getTrustedWebClientWithAuth(removePath, configManager.getHubIp());
    javax.ws.rs.core.Response r = client.delete();
    if ((r.getStatus()) == (org.apache.http.HttpStatus.SC_NO_CONTENT)) {
        io.subutai.core.hubmanager.impl.processor.ProductProcessor.LOG.debug(("Status: " + "no content"));
    }
}
public void handleUrlPrefixChange(java.lang.String urlPfxString) {
    com.cisco.ctao.sparkbot.core.webhooksvr.WebhookServer.LOG.info("handleUrlPrefixChange: urlPfxString: {}", urlPfxString);
    if (urlPfxString != null) {
        try {
            java.net.URI tmpPrefix = new java.net.URI(urlPfxString);
            if (((urlPrefix) != null) && (!(urlPrefix.equals(tmpPrefix)))) {
                updateWebhookTargetUrls(urlPrefix, tmpPrefix);
            }
            urlPrefix = tmpPrefix;
        } catch (java.net.URISyntaxException e) {
            com.cisco.ctao.sparkbot.core.webhooksvr.WebhookServer.LOG.error("handleUrlPrefixChange: Invalid URL Prefix {} ", urlPfxString, e);
        }
    }
}
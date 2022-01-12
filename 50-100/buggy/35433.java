private java.lang.Boolean parseRestResult(java.lang.String responseBody) {
    com.emc.storageos.driver.vmaxv3driver.rest.SloprovisioningSymmetrixStorageGroupPost.logger.debug("Response body = {}", responseBody);
    com.google.gson.JsonObject root = this.parseResponse(responseBody);
    if (((root.get("success")) == null) || (!(root.get("success").getAsBoolean()))) {
        throw new com.emc.storageos.driver.vmaxv3driver.exception.Vmaxv3RestCallException(root.get("message").getAsString());
    }
    return java.lang.Boolean.TRUE;
}
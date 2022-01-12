@java.lang.Override
public com.hpe.adm.nga.sdk.network.OctaneHttpResponse execute(com.hpe.adm.nga.sdk.network.OctaneHttpRequest octaneHttpRequest) {
    java.lang.String returnJson = "{\"total_count\":0,\"data\":[],\"exceeds_total_count\":false}";
    java.io.InputStream stream = new java.io.ByteArrayInputStream(returnJson.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    return new com.hpe.adm.nga.sdk.network.OctaneHttpResponse(202, stream, java.nio.charset.StandardCharsets.UTF_8);
}
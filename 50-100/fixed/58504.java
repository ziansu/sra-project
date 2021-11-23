public com.emc.storageos.isilon.restapi.IsilonNFSACL getNFSACL(java.lang.String fspath) throws com.emc.storageos.isilon.restapi.IsilonException {
    java.lang.String aclUrl = fspath.concat("?acl").substring(1);
    try {
        aclUrl = java.net.URLEncoder.encode(aclUrl, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return getObj(_baseUrl.resolve(com.emc.storageos.isilon.restapi.IsilonApi.URI_IFS), aclUrl, com.emc.storageos.isilon.restapi.IsilonNFSACL.class);
}
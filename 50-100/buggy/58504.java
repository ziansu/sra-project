public com.emc.storageos.isilon.restapi.IsilonNFSACL getNFSACL(java.lang.String fspath) throws com.emc.storageos.isilon.restapi.IsilonException {
    try {
        fspath = java.net.URLEncoder.encode(fspath, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    java.lang.String aclUrl = fspath.concat("?acl").substring(1);
    return getObj(_baseUrl.resolve(com.emc.storageos.isilon.restapi.IsilonApi.URI_IFS), aclUrl, com.emc.storageos.isilon.restapi.IsilonNFSACL.class);
}
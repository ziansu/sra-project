public void modifyNFSACL(java.lang.String fspath, com.emc.storageos.isilon.restapi.IsilonNFSACL acl) throws com.emc.storageos.isilon.restapi.IsilonException {
    try {
        fspath = java.net.URLEncoder.encode(fspath, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    java.lang.String aclUrl = fspath.concat("?acl").substring(1);
    put(_baseUrl.resolve(com.emc.storageos.isilon.restapi.IsilonApi.URI_IFS), aclUrl, "ACL", acl);
}
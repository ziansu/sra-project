public void modifyNFSACL(java.lang.String fspath, com.emc.storageos.isilon.restapi.IsilonNFSACL acl) throws com.emc.storageos.isilon.restapi.IsilonException {
    java.lang.String aclUrl = fspath.concat("?acl").substring(1);
    try {
        aclUrl = java.net.URLEncoder.encode(aclUrl, "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    put(_baseUrl.resolve(com.emc.storageos.isilon.restapi.IsilonApi.URI_IFS), aclUrl, "ACL", acl);
}
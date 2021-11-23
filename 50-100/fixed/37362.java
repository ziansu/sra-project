public void modifyNFSACL(java.lang.String fspath, com.emc.storageos.isilon.restapi.IsilonNFSACL acl) throws com.emc.storageos.isilon.restapi.IsilonException {
    try {
        fspath = fspath.substring(1);
        fspath = java.net.URLEncoder.encode(fspath, "UTF-8");
        fspath = fspath.concat("?acl");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    put(_baseUrl.resolve(com.emc.storageos.isilon.restapi.IsilonApi.URI_IFS), fspath, "ACL", acl);
}
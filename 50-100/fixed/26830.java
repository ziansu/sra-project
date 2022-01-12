public com.emc.storageos.isilon.restapi.IsilonNFSACL getNFSACL(java.lang.String fspath) throws com.emc.storageos.isilon.restapi.IsilonException {
    try {
        fspath = fspath.substring(1);
        fspath = java.net.URLEncoder.encode(fspath, "UTF-8");
        fspath = fspath.concat("?acl");
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return getObj(_baseUrl.resolve(com.emc.storageos.isilon.restapi.IsilonApi.URI_IFS), fspath, com.emc.storageos.isilon.restapi.IsilonNFSACL.class);
}
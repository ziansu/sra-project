private void createFolderRec(java.lang.String id) throws java.io.IOException {
    java.lang.String parentId = de.unipotsdam.elis.webdav.util.WebdavIdUtil.getParentIdFromChildId(id);
    if (!(parentId.equals(StringPool.FORWARD_SLASH)))
        createFolderRec(parentId);
    
    java.lang.String webdavPath = (endpoint.getEndpoint()) + id;
    if (!(endpoint.getSardine().exists(webdavPath))) {
        endpoint.getSardine().createDirectory(webdavPath);
    }
}
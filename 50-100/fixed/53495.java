private void createFolderRec(java.lang.String id) throws java.io.IOException {
    java.lang.String webdavPath = (endpoint.getEndpoint()) + id;
    if ((id.equals(StringPool.FORWARD_SLASH)) || (endpoint.getSardine().exists(webdavPath)))
        return ;
    
    createFolderRec(de.unipotsdam.elis.webdav.util.WebdavIdUtil.getParentIdFromChildId(id));
    endpoint.getSardine().createDirectory(webdavPath);
}
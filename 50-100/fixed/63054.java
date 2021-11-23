private boolean canEditItems(java.lang.Integer collectionId) {
    edu.harvard.lib.librarycloud.collections.Collection c = collectionDao.getCollection(collectionId);
    if (c == null)
        return false;
    
    edu.harvard.lib.librarycloud.collections.User user = ((edu.harvard.lib.librarycloud.collections.User) (securityContext.getUserPrincipal()));
    if (user != null) {
        if (isSystemAdmin())
            return true;
        
        return collectionDao.canUserEditItems(c, user);
    }
    return false;
}
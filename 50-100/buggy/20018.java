@java.lang.Override
public com.jomm.terroir.business.model.Site create(com.jomm.terroir.business.model.Site site) throws com.jomm.terroir.util.InvalidEntityException, java.lang.NullPointerException {
    if (site == null) {
        throw new java.lang.NullPointerException();
    }else
        if ((site.getId()) != null) {
            throw new com.jomm.terroir.util.InvalidEntityException();
        }
    
    return siteDao.update(site);
}
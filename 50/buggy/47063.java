public boolean deleteByWebKey(java.lang.String webKey) {
    if (com.hsjawanda.gaeobjectify.data.ObjectifyDao.isBlank(webKey))
        return true;
    
    return deleteByKey(com.googlecode.objectify.Key.<T>create(webKey));
}
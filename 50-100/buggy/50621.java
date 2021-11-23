public void deferredDeleteById(java.lang.String id) {
    if (com.hsjawanda.gaeobjectify.data.ObjectifyDao.isNotBlank(id)) {
        com.googlecode.objectify.Key<T> key = keyFor(id);
        if (null != key) {
            com.hsjawanda.gaeobjectify.data.ObjectifyDao.ofy().defer().delete().key(key);
        }
    }
}
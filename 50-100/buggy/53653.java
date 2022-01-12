@java.lang.Override
public com.pratilipi.data.transfer.Language getLanguage(java.lang.Long id) {
    com.pratilipi.data.transfer.Language language = memcache.get(((com.pratilipi.data.access.DataAccessorWithMemcache.PREFIX_LANGUAGE) + id));
    if (language == null) {
        language = dataAccessor.getLanguage(id);
        if (language != null)
            memcache.put(((com.pratilipi.data.access.DataAccessorWithMemcache.PREFIX_LANGUAGE) + id), language);
        
    }
    return language;
}
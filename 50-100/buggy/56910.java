@java.lang.Override
public com.pratilipi.data.type.AppProperty getAppProperty(java.lang.String id) {
    if (dataAccessor.isTxActive())
        return dataAccessor.getAppProperty(id);
    
    com.pratilipi.data.type.AppProperty appProperty = memcache.get(((com.pratilipi.data.DataAccessorWithMemcache.PREFIX_APP_PROPERTY) + id));
    if (appProperty == null) {
        appProperty = dataAccessor.getAppProperty(id);
        if (appProperty != null)
            memcache.put(((com.pratilipi.data.DataAccessorWithMemcache.PREFIX_APP_PROPERTY) + id), appProperty);
        
    }
    return appProperty;
}
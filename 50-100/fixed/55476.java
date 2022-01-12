@java.lang.Override
public com.pratilipi.data.type.Page getPage(java.lang.String uri) {
    com.pratilipi.data.type.Page page = memcache.get(((com.pratilipi.data.DataAccessorWithMemcache.PREFIX_PAGE) + uri));
    if (page == null) {
        page = dataAccessor.getPage(uri);
        if (page == null)
            page = dataAccessor.newPage();
        
        memcache.put(((com.pratilipi.data.DataAccessorWithMemcache.PREFIX_PAGE) + uri), page);
    }
    return (page.getId()) == null ? null : page;
}
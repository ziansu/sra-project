@java.lang.Override
public java.util.List<com.pratilipi.data.AuthorByReadCount> getAuthorByReadCount(java.util.Date date, com.pratilipi.common.type.Language language, int resultCount) {
    com.googlecode.objectify.cmd.Query<com.pratilipi.data.AuthorByReadCountEntity> query = com.googlecode.objectify.ObjectifyService.ofy().load().type(com.pratilipi.data.AuthorByReadCountEntity.class);
    query = query.filter("DATE", date).filter("LANGUAGE", language).filter("USER_ID >", "0").order("-READ_COUNT").limit(resultCount);
    return new java.util.ArrayList<com.pratilipi.data.AuthorByReadCount>(query.list());
}
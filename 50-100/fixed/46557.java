@java.lang.Override
public java.util.List<com.pratilipi.data.type.Event> getEventList(com.pratilipi.common.type.Language language) {
    com.googlecode.objectify.cmd.Query<com.pratilipi.data.type.gae.EventEntity> query = com.googlecode.objectify.ObjectifyService.ofy().load().type(com.pratilipi.data.type.gae.EventEntity.class);
    if (language != null)
        query = query.filter("LANGUAGE = ", language);
    
    query = query.order("~CREATION_DATE");
    return new java.util.ArrayList<com.pratilipi.data.type.Event>(query.list());
}
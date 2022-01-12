@java.lang.Override
public java.lang.Object buildReadAllQueryResponse(org.eclipse.persistence.jpa.rs.PersistenceContext context, java.util.Map<java.lang.String, java.lang.Object> queryParams, java.util.List<java.lang.Object> items, javax.ws.rs.core.UriInfo uriInfo) {
    org.eclipse.persistence.jpa.rs.util.list.ReadAllQueryResultCollection response = new org.eclipse.persistence.jpa.rs.util.list.ReadAllQueryResultCollection();
    for (java.lang.Object item : items) {
        response.addItem(populatePagedReadAllQueryItemLinks(context, item));
    }
    return populatePagedCollectionLinks(queryParams, uriInfo, response);
}
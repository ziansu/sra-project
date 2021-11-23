@javax.ws.rs.GET
@javax.ws.rs.Path(value = "categories")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML })
public org.opennms.web.rest.v1.ForeignSourceConfigRestService.ElementList getCategories() {
    final org.opennms.web.rest.v1.ForeignSourceConfigRestService.ElementList list = new org.opennms.web.rest.v1.ForeignSourceConfigRestService.ElementList(m_provisioningService.getNodeCategoryNames());
    java.util.Collections.sort(list);
    return list;
}
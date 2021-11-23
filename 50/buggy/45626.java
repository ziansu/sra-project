@javax.ws.rs.GET
@javax.ws.rs.Path(value = "services/{groupName}")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_ATOM_XML })
public org.opennms.web.rest.v1.ForeignSourceConfigRestService.ElementList getServices(@javax.ws.rs.PathParam(value = "groupName")
java.lang.String groupName) {
    final org.opennms.web.rest.v1.ForeignSourceConfigRestService.ElementList list = new org.opennms.web.rest.v1.ForeignSourceConfigRestService.ElementList(m_provisioningService.getServiceTypeNames(groupName));
    java.util.Collections.sort(list);
    return list;
}
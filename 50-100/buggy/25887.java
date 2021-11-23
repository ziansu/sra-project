@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/schema/{schema_prefix}/metadata-fields/{element}")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.APPLICATION_XML })
public org.dspace.rest.common.MetadataField getMetadataFieldUnqualified(@javax.ws.rs.PathParam(value = "schema_prefix")
java.lang.String schemaPrefix, @javax.ws.rs.PathParam(value = "element")
java.lang.String element, @javax.ws.rs.QueryParam(value = "expand")
java.lang.String expand, @javax.ws.rs.QueryParam(value = "userIP")
java.lang.String user_ip, @javax.ws.rs.QueryParam(value = "userAgent")
java.lang.String user_agent, @javax.ws.rs.QueryParam(value = "xforwardedfor")
java.lang.String xforwardedfor, @javax.ws.rs.core.Context
javax.ws.rs.core.HttpHeaders headers, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) throws javax.ws.rs.WebApplicationException {
    return getMetadataFieldQualified(schemaPrefix, element, "", expand, user_ip, user_agent, xforwardedfor, headers, request);
}
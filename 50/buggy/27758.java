@com.uom.cse.distsearch.service.Path(value = "/searchuser")
@com.uom.cse.distsearch.service.GET
@com.uom.cse.distsearch.service.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public javax.ws.rs.core.Response searchuser(@javax.validation.constraints.NotNull
@com.uom.cse.distsearch.service.PathParam(value = "ip")
java.lang.String ip, @javax.validation.constraints.NotNull
@com.uom.cse.distsearch.service.QueryParam(value = "query")
java.lang.String query) {
    com.uom.cse.distsearch.service.Service.LOGGER.debug("Request to search {}", query);
    node.startSearch(context, query);
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity(Constant.SEROK).build();
}
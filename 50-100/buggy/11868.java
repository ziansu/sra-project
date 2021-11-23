@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/getMoreInfo/{type}/{id}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getMoreInfo(@javax.ws.rs.PathParam(value = "type")
java.lang.String type, @javax.ws.rs.PathParam(value = "id")
java.lang.Integer id) throws io.hops.hopsworks.common.exception.AppException {
    io.hops.hopsworks.common.project.MoreInfoDTO info = null;
    if (id != null) {
        if ("proj".equals(type)) {
            io.hops.hopsworks.common.dao.project.Project proj = projectFacade.find(id);
            info = new io.hops.hopsworks.common.project.MoreInfoDTO(proj);
        }else
            if ("ds".equals(type)) {
                info = datasetInfo(id);
            }
        
    }
    return noCacheResponse.getNoCacheResponseBuilder(Response.Status.OK).entity(info).build();
}
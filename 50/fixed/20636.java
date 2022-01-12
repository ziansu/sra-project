@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{id}")
@javax.ws.rs.Produces(value = "application/json")
public com.sura.it.management.platforms.model.Platform getPlatform(@javax.ws.rs.PathParam(value = "id")
int id) throws java.net.URISyntaxException, java.sql.SQLException {
    return com.sura.it.management.platforms.dataAccess.PlatformsDataAccess.getPlatformById(id);
}
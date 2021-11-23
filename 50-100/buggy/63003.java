@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{fileName}")
public javax.ws.rs.core.Response getFile(@javax.ws.rs.PathParam(value = "fileName")
java.lang.String fileName) {
    java.io.File file = java.nio.file.Paths.get(org.wso2.msf4j.example.FileServer.MOUNT_PATH, fileName).toFile();
    if (file.exists()) {
        return javax.ws.rs.core.Response.ok(file).build();
    }
    return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).build();
}
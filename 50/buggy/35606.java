@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = "multipart/form-data")
@javax.ws.rs.Produces(value = "text/plain")
public java.lang.String get(@org.glassfish.jersey.media.multipart.FormDataParam(value = "file")
final java.io.File file) {
    final java.lang.String path = file.getAbsolutePath();
    file.delete();
    return path;
}
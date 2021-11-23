@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/{id}")
@javax.ws.rs.Produces(value = "text/plain")
public java.lang.String deleteJson(@javax.ws.rs.PathParam(value = "id")
int id) {
    return messageController.deleteById(id);
}
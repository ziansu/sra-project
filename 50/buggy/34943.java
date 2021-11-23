@javax.ws.rs.GET
@javax.ws.rs.Path(value = "content/{id}/api/p")
public java.lang.String getContent(@javax.ws.rs.PathParam(value = "id")
int id) throws java.lang.Exception {
    return serialize(marketplaceDAO.getContent(id));
}
@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "/{id}")
public javax.ws.rs.core.Response update(@javax.ws.rs.PathParam(value = "id")
int id, com.neogrowth.tech.uie.data.ManualDataCollection collection) {
    if ((collection.getId()) == 0) {
        collection.setId(id);
    }else
        if ((collection.getId()) != id) {
            return javax.ws.rs.core.Response.status(Response.Status.BAD_REQUEST).build();
        }
    
    int numberOfRowsChanged = manualDataCollectionApi.update(collection);
    return javax.ws.rs.core.Response.status(Response.Status.OK).entity(numberOfRowsChanged).build();
}
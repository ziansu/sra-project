@javax.ws.rs.Path(value = "{deckName}")
@javax.ws.rs.DELETE
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.TEXT_PLAIN })
public javax.ws.rs.core.Response deleteDeck(@javax.ws.rs.PathParam(value = "deckName")
java.lang.String deckName) {
    javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(Status.OK).entity("Success").type(MediaType.TEXT_PLAIN);
    if (!(jdransoft.data.memory.MemoryDeckData.getInstance().deleteDeck(deckName))) {
        builder = javax.ws.rs.core.Response.status(Status.INTERNAL_SERVER_ERROR).entity("There was an issue deleting the deck").type(MediaType.TEXT_PLAIN);
    }
    return builder.build();
}
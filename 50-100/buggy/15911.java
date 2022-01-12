@javax.ws.rs.DELETE
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.TEXT_PLAIN })
public javax.ws.rs.core.Response deleteDeck(jdransoft.model.DeckRequest deckRequest) {
    java.lang.String deckName = deckRequest.getName();
    javax.ws.rs.core.Response.ResponseBuilder builder = javax.ws.rs.core.Response.status(Status.OK).entity("Success").type(MediaType.TEXT_PLAIN);
    if (!(jdransoft.data.memory.MemoryDeckData.getInstance().deleteDeck(deckName))) {
        builder = javax.ws.rs.core.Response.status(Status.INTERNAL_SERVER_ERROR).entity("There was an issue deleting the deck").type(MediaType.TEXT_PLAIN);
    }
    return builder.build();
}
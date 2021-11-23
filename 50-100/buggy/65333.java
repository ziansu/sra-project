@com.java.controllers.GET
@com.java.controllers.Path(value = "/name/{deckName}")
@com.java.controllers.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response fetchByName(@com.java.controllers.PathParam(value = "deckName")
java.lang.String deckName) {
    com.java.storage.MemoryStorage storage = com.java.storage.MemoryStorage.getInstance();
    com.java.models.Deck deck = storage.fetchDeck(deckName);
    if (deck != null) {
        return javax.ws.rs.core.Response.status(Response.Status.NOT_FOUND).build();
    }
    return javax.ws.rs.core.Response.ok(deck).build();
}
@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response createBook(java.lang.String json) {
    try {
        final edu.hm.weidacher.softarch.shareit.data.model.Book book = getGson().fromJson(json, edu.hm.weidacher.softarch.shareit.data.model.Book.class);
        bookDao.store(book);
        return buildCreatedResponse(book.getIsbn());
    } catch (edu.hm.weidacher.softarch.shareit.exceptions.PersistenceException e) {
        return error(e);
    } catch (com.google.gson.JsonSyntaxException e) {
        return error("Bad book model given", Response.Status.BAD_REQUEST);
    }
}
@java.lang.Override
@javax.jws.WebMethod
@com.camelatwork.components.cxfrs.services.impl.DELETE
@com.camelatwork.components.cxfrs.services.impl.Path(value = "/book/{bookId}")
public javax.ws.rs.core.Response deleteBook(@com.camelatwork.components.cxfrs.services.impl.PathParam(value = "bookId")
java.lang.Long bookId) {
    boolean deleteFlag = false;
    if (com.camelatwork.components.cxfrs.services.impl.BookStoreRESTServiceImpl.LOG.isDebugEnabled()) {
        com.camelatwork.components.cxfrs.services.impl.BookStoreRESTServiceImpl.LOG.debug("BookStoreRESTServiceImpl:: delete ------START-------");
        com.camelatwork.components.cxfrs.services.impl.BookStoreRESTServiceImpl.LOG.debug(bookId.toString());
        com.camelatwork.components.cxfrs.services.impl.BookStoreRESTServiceImpl.LOG.debug(("BookStoreRESTServiceImpl:: delete Request value " + bookId));
    }
    return javax.ws.rs.core.Response.created(java.net.URI.create("/")).build();
}
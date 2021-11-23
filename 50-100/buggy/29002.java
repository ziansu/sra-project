@org.books.application.rest.POST
@org.books.application.rest.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_XML })
@org.books.application.rest.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML })
public javax.ws.rs.core.Response placeOrder(org.books.application.dto.PurchaseOrder purchaseOrder) {
    try {
        javax.ws.rs.core.Response.status(Response.Status.CREATED).entity(orderService.placeOrder(purchaseOrder)).build();
    } catch (org.books.application.rest.CustomerNotFoundException e) {
        throw new org.books.application.rest.WebApplicationException("Customer not found", Response.Status.NOT_FOUND);
    } catch (org.books.application.rest.BookNotFoundException e) {
        throw new org.books.application.rest.WebApplicationException("Book not found", Response.Status.NOT_FOUND);
    } catch (org.books.application.rest.PaymentFailedException e) {
        throw new org.books.application.rest.WebApplicationException("Payment error", Response.Status.PAYMENT_REQUIRED);
    }
    return null;
}
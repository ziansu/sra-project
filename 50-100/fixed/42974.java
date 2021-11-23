@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{id}")
public javax.ws.rs.core.Response getProductById(@javax.ws.rs.PathParam(value = "id")
final int id) {
    tp.paw.khet.webapp.rest.ProductsController.LOGGER.debug("Accesed getProductById with ID: {}", id);
    final tp.paw.khet.model.Product product = productService.getFullProductById(id);
    if (product == null) {
        tp.paw.khet.webapp.rest.ProductsController.LOGGER.warn("Product with ID: {} not found", id);
        return javax.ws.rs.core.Response.status(Status.NOT_FOUND).build();
    }else {
        return javax.ws.rs.core.Response.ok(new tp.paw.khet.webapp.dto.ProductDTO(product, uriContext.getBaseUri())).build();
    }
}
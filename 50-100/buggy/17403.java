@javax.ws.rs.PUT
@javax.ws.rs.Path(value = "{id}")
public javax.ws.rs.core.Response updateCustomer(@javax.ws.rs.PathParam(value = "id")
java.lang.Long id, java.lang.String content) {
    se.lemv.model.Customer customer = se.lemv.model.CustomerParser.fromString(content);
    service.update(id, customer);
    customer = service.get(id);
    return javax.ws.rs.core.Response.ok(se.lemv.model.CustomerParser.asString(customer)).build();
}
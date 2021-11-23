@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
@javax.ws.rs.Path(value = "{cust_name}")
public com.starbucks.models.Customer getCustomer(@javax.ws.rs.PathParam(value = "cust_name")
java.lang.String custName) {
    com.starbucks.models.Customer customer = repository.findByCustName(custName);
    return customer;
}
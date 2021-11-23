@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{id}")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
public rs.ac.uns.ftn.xws.entities.payments.Invoice findById(@javax.ws.rs.PathParam(value = "PIB")
java.lang.String PIB, @javax.ws.rs.PathParam(value = "id")
java.lang.String id) throws java.lang.Exception {
    rs.ac.uns.ftn.xws.entities.payments.Invoice retVal = null;
    retVal = invoiceDao.findById(java.lang.Long.parseLong(id));
    if (retVal.getSupplierTIN().equals(PIB))
        return retVal;
    
    return null;
}
@javax.ws.rs.GET
@javax.ws.rs.Path(value = "{id}/stavke")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
public java.util.List<rs.ac.uns.ftn.xws.entities.payments.InvoiceItem> findAllItems(@javax.ws.rs.PathParam(value = "PIB")
java.lang.String PIB, @javax.ws.rs.PathParam(value = "id")
java.lang.String id) {
    rs.ac.uns.ftn.xws.entities.payments.Invoice retVal = null;
    try {
        retVal = invoiceDao.findById(java.lang.Long.parseLong(id));
        if (retVal.getSupplierTIN().equals(PIB))
            return retVal.getInvoiceItems().getInvoiceItem();
        
    } catch (java.lang.Exception e) {
        rs.ac.uns.ftn.xws.services.payments.InvoiceService.log.error(e.getMessage(), e);
    }
    return null;
}
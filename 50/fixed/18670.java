@javax.ws.rs.POST
@javax.ws.rs.Path(value = "{id}/stavke/")
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
public void createInvoiceItem(rs.ac.uns.ftn.xws.entities.payments.InvoiceItem newItem, @javax.ws.rs.PathParam(value = "id")
java.lang.String id) throws java.lang.Exception {
    invoiceDao.createInvoiceItem(java.lang.Long.parseLong(id), newItem);
}
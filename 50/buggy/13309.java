@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
public void createInvoice(rs.ac.uns.ftn.xws.entities.payments.Invoice entity) {
    try {
        java.lang.System.out.println(("entity: " + entity));
        invoiceDao.persist(entity);
    } catch (java.lang.Exception e) {
        rs.ac.uns.ftn.xws.services.payments.InvoiceService.log.error(e.getMessage(), e);
    }
}
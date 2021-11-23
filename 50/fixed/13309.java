@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
public void createInvoice(rs.ac.uns.ftn.xws.entities.payments.Invoice entity) throws java.lang.Exception {
    invoiceDao.persist(entity);
}
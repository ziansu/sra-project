@org.junit.Test
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testUpdateInvoice_shouldUpdateInvoiceWithoutUser() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException, com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    invoice.setTime(java.time.LocalDateTime.now());
    invoice.setGross(new java.math.BigDecimal("15.6"));
    invoiceService.addInvoice(invoice);
    org.mockito.Mockito.verify(invoiceDAO).create(invoice);
    invoice.setIdentity(1L);
    invoice.setGross(new java.math.BigDecimal("22"));
    invoiceService.updateInvoice(invoice);
    org.mockito.Mockito.verify(invoiceDAO).update(invoice);
}
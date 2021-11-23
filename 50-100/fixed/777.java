@org.junit.Test
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testAddInvoice_shouldAddInvoiceWithoutUser() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException, com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    invoice.setTime(java.time.LocalDateTime.now());
    invoice.setGross(new java.math.BigDecimal("15.6"));
    invoiceService.addInvoice(invoice);
    verify(invoiceDAO).create(invoice);
}
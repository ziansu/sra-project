@org.junit.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testUpdateInvoice_shouldFailWithoutGrossAmount() throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    invoice.setTime(java.time.LocalDateTime.now());
    invoice.setGross(new java.math.BigDecimal("15.6"));
    invoice.setCreator(creator1);
    invoiceService.addInvoice(invoice);
    invoice.setIdentity(1L);
    invoice.setGross(null);
    doThrow(new com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException("")).when(invoiceValidator).validateForUpdate(invoice);
    invoiceService.updateInvoice(invoice);
}
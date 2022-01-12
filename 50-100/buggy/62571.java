@org.junit.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testAddInvoice_shouldFailWithIncompleteObject() throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    invoice.setTime(java.time.LocalDateTime.now());
    org.mockito.Mockito.doThrow(new com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException("")).when(invoiceValidator).validateForCreate(invoice);
    invoiceService.addInvoice(invoice);
}
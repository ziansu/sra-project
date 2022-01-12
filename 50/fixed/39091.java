@org.junit.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testUpdateInvoice_shouldFailWithEmptyObject() throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    doThrow(new com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException("")).when(invoiceValidator).validateForUpdate(invoice);
    invoiceService.updateInvoice(invoice);
}
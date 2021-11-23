@org.junit.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testDeleteInvoice_shouldFailWithNullObject() throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    org.mockito.Mockito.doThrow(new com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException("")).when(invoiceValidator).validateForDelete(null);
    invoiceService.deleteInvoice(null);
}
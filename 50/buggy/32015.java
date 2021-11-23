@org.junit.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException.class)
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testGetReservationHistory_onDAOExceptionShouldThrow() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException, com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice res = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    org.mockito.Mockito.doThrow(new com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException("")).when(invoiceDAO).getHistory(res);
    invoiceService.getInvoiceHistory(res);
}
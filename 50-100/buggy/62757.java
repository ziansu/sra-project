@org.junit.Test
@org.springframework.security.test.context.support.WithMockUser(username = "servicetester", roles = { "SERVICE" })
public void testFindInvoices_shouldReturnEmptyListWhenSearchingNull() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    org.mockito.Mockito.when(invoiceDAO.find(null)).thenReturn(new java.util.ArrayList<>());
    java.util.List<com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice> invoices = invoiceService.findInvoices(null);
    org.mockito.Mockito.verify(invoiceDAO).find(null);
    assertTrue(invoices.isEmpty());
}
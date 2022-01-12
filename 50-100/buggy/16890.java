@com.at.ac.tuwien.sepm.ss15.edulium.dao.Test
public void testFind_shouldReturnEmptyListWhenNoObjectIsStored() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    invoice.setIdentity(1L);
    java.util.List<com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice> allInvoices = invoiceDAO.getAll();
    assertNotNull(allInvoices);
    assertTrue(allInvoices.isEmpty());
    java.util.List<com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice> search = invoiceDAO.find(invoice);
    assertTrue(search.isEmpty());
}
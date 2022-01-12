@com.at.ac.tuwien.sepm.ss15.edulium.dao.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
public void testUpdate_shouldFailWhenObjectIsNull() throws com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException, com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = null;
    invoiceDAO.update(invoice);
}
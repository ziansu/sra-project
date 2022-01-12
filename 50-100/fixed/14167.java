@java.lang.Override
public void updateInvoice(com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice) throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.service.impl.InvoiceServiceImpl.LOGGER.debug(("Entering updateInvoice with parameters: " + invoice));
    updateGross(invoice);
    invoiceValidator.validateForUpdate(invoice);
    try {
        invoiceDAO.update(invoice);
    } catch (com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException e) {
        throw new com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException("Could not update invoice", e);
    }
}
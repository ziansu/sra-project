@java.lang.Override
public void addInvoice(com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice) throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.service.impl.InvoiceServiceImpl.LOGGER.debug(("Entering addInvoice with parameters: " + invoice));
    invoiceValidator.validateForCreate(invoice);
    updateGross(invoice);
    try {
        invoiceDAO.create(invoice);
    } catch (com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException e) {
        throw new com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException("Could not add invoice", e);
    }
}
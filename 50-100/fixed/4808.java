@java.lang.Override
public void addOrder(com.at.ac.tuwien.sepm.ss15.edulium.domain.Order order) throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException, com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException {
    com.at.ac.tuwien.sepm.ss15.edulium.service.impl.OrderServiceImpl.LOGGER.debug(("Entering addOrder with parameter: " + order));
    orderValidator.validateForCreate(order);
    try {
        saleService.applySales(order);
        orderDAO.create(order);
        tableBusinessLogic.addedOrder(order);
    } catch (com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException e) {
        com.at.ac.tuwien.sepm.ss15.edulium.service.impl.OrderServiceImpl.LOGGER.error("An Error has occurred in the data access object", e);
        throw new com.at.ac.tuwien.sepm.ss15.edulium.service.ServiceException("An Error has occurred in the data access object");
    }
}
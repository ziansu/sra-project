public boolean selectOrder(main.facade.Driver driver, main.facade.Order order) throws main.facade.ApplicationError {
    boolean res = driver.selectOrder(order);
    if (!(driver.selectOrder(order))) {
        return false;
    }
    try {
        main.facade.DriverFacade.orderRepository.update(order);
        main.facade.DriverFacade.repository.update(driver);
    } catch (main.repository.exceptions.DatabaseException e) {
        throw new main.facade.ApplicationError(e);
    }
    return true;
}
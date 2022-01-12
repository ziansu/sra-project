public boolean selectOrder(main.facade.Driver driver, main.facade.Order order) throws main.facade.ApplicationError {
    boolean result = driver.selectOrder(order);
    try {
        main.facade.DriverFacade.orderRepository.update(order);
        main.facade.DriverFacade.repository.update(driver);
    } catch (main.repository.exceptions.DatabaseException e) {
        throw new main.facade.ApplicationError(e);
    }
    return result;
}
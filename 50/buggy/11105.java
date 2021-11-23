void loadOrderData() throws business.exceptions.BackendException {
    orderSubsystem = new business.ordersubsystem.OrderSubsystemFacade(customerProfile);
    orderHistory = orderSubsystem.getOrderHistory();
    business.customersubsystem.CustomerSubsystemFacade.LOGGER.info(("total count of order history =  " + (orderHistory.size())));
}
void loadOrderData() throws business.exceptions.BackendException {
    orderSubsystem = new business.ordersubsystem.OrderSubsystemFacade(customerProfile);
}
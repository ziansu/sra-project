@java.lang.Override
public void createCustomerOrderLine(com.qac.row5project.entities.CustomerOrderLine customerOrderLine) {
    java.util.List<com.qac.row5project.entities.CustomerOrderLine> newCOLine = testData.getCustomerOrderLine();
    customerOrderLine.setId(((newCOLine.size()) + 1));
    newCOLine.add(customerOrderLine);
    testData.setCustomerOrderLine(newCOLine);
}
@java.lang.Override
public com.qac.row5project.entities.CustomerOrderLine readByCustomerOrder_idOrder(com.qac.row5project.entities.CustomerOrderLine CustomerOrder_idOrder) {
    java.util.List<com.qac.row5project.entities.CustomerOrderLine> rCO_idOrder = testData.getCustomerOrderLine();
    for (com.qac.row5project.entities.CustomerOrderLine col : rCO_idOrder) {
        if ((col.getId()) == (CustomerOrder_idOrder.getId())) {
            return col;
        }
    }
    return null;
}
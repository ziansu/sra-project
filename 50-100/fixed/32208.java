@java.lang.Override
public void update(model.Order order, int id) throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.Connection connection = operationManager.setConnection();
    java.lang.String sql = (((((("UPDATE  ORDERS o SET o.sellerId = " + (order.getSellerId())) + ", o.customerId = ") + (order.getCustomerId())) + ", o.totalAmount = ") + (order.getTotalAmount())) + "WHERE id = ") + id;
    operationManager.doQuery(sql);
    operationManager.closeConnection();
}
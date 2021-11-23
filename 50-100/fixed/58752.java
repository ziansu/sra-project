@java.lang.Override
public void create(model.Order order) throws java.io.IOException, java.lang.ClassNotFoundException, java.sql.SQLException {
    java.sql.Connection connection = operationManager.setConnection();
    java.lang.String sql = ((((("INSERT INTO ORDERS VALUES ( DEFAULT, " + (order.getSellerId())) + ",") + (order.getCustomerId())) + ",") + (order.getTotalAmount())) + ")";
    operationManager.doQuery(sql);
    operationManager.closeConnection();
}
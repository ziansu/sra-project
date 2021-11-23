@java.lang.Override
public com.trivera.jdbc.Customer delete(com.trivera.jdbc.Customer customer) {
    try {
        connection.setAutoCommit(false);
        deleteStatement.setLong(1, customer.getCustomerId());
        deleteStatement.execute();
        connection.commit();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        try {
            connection.rollback();
        } catch (java.sql.SQLException e1) {
            e1.printStackTrace();
        }
    }
    return customer;
}
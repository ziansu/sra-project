@java.lang.Override
public void add(com.codecool.shop.model.Supplier supplier) {
    try {
        java.lang.String query = "INSERT INTO suppliers (supplier_name, supplier_description) VALUES(?,?);";
        java.sql.Connection connection = getConnection();
        java.sql.PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, supplier.getName());
        stmt.setString(2, supplier.getDescription());
        stmt.executeQuery();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("Supplier could not be added to the database.");
    }
}
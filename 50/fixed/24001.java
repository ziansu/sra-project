@java.lang.Override
public void update() throws java.sql.SQLException {
    java.lang.String sql = "UPDATE ItemDealGroup SET description = ?, shortName = ?, " + ("quantity = ?, total = ?, requireQuantity = ?, alternatePrice = ? " + "WHERE id = ?");
    conn.executeNonQuery(sql, description, shortName, quantity, total, requireQuantity, alternatePrice, id);
}
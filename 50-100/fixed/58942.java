@java.lang.Override
public org.cdltax.canteen.master.domain.ItemInventory mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    double stock = rs.getDouble(5);
    double totalCost = rs.getDouble(6);
    double unitCost = 0;
    if (stock != 0) {
        unitCost = totalCost / stock;
    }
    return new org.cdltax.canteen.master.domain.ItemInventory(rs.getInt(1), rs.getString(2), rs.getString(3), stock, unitCost);
}
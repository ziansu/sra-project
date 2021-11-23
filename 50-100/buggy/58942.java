@java.lang.Override
public org.cdltax.canteen.master.domain.ItemInventory mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    double stock = rs.getDouble(5);
    double totalCost = rs.getDouble(6);
    double unitCost = 0;
    if (stock != 0) {
        unitCost = (java.lang.Math.round(((totalCost / stock) * 100.0))) / 100.0;
    }
    return new org.cdltax.canteen.master.domain.ItemInventory(rs.getInt(1), rs.getString(2), rs.getString(3), stock, unitCost);
}
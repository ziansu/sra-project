public static void updateItemQtyByItemNum(int amount, java.lang.String itemNumber) throws java.sql.SQLException {
    SQL_Handler.stmt = SQL_Handler.sql_statements.get("UpdateItemQty");
    int currentStock = SQL_Handler.getItemCurrentStock(itemNumber);
    SQL_Handler.stmt.setInt(1, (currentStock + amount));
    SQL_Handler.stmt.setString(2, itemNumber);
    SQL_Handler.stmt.execute();
}
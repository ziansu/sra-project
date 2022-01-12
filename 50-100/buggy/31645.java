@java.lang.Override
public org.clintonhealthaccess.lmis.app.models.StockItemSnapshot operate(Dao<org.clintonhealthaccess.lmis.app.models.StockItemSnapshot, java.lang.String> dao) throws java.sql.SQLException {
    QueryBuilder<org.clintonhealthaccess.lmis.app.models.StockItemSnapshot, java.lang.String> queryBuilder = dao.queryBuilder();
    queryBuilder.where().eq("commodity_id", commodity.getId()).and().le("created", currentDate);
    queryBuilder.orderBy("created", false);
    PreparedQuery<org.clintonhealthaccess.lmis.app.models.StockItemSnapshot> query = queryBuilder.prepare();
    return dao.queryForFirst(query);
}
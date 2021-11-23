public com.jfinal.plugin.activerecord.Record getBookPriceCount(java.lang.String mySearchSql) {
    return com.jfinal.plugin.activerecord.Db.findFirst("SELECT TRUNCATE(sum(sale_rmb), 2) AS rmb, TRUNCATE(SUM(sale_dollar), 2) AS dollar, SUM(sale_count) AS count, TRUNCATE(SUM(discount), 2) AS discount FROM cw_sale WHERE 1=1 ");
}
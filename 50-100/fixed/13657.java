public de.mreturkey.sql.result.Result execute(de.mreturkey.sql.provider.Provider provider) throws java.sql.SQLException, java.sql.SQLTimeoutException {
    de.mreturkey.sql.query.SelectQuery sq = new de.mreturkey.sql.query.SelectQuery();
    sq.setTable(table);
    sq.setColumns(columns);
    sq.setLimit(limit);
    sq.setOffset(offset);
    sq.setOrderBy(orderBy);
    sq.setWhereClausel(whereClausel);
    return provider.select(sq);
}
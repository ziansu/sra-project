public static com.healthmarketscience.sqlbuilder.UpdateQuery generateUpdateQuery(com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable tabel, com.healthmarketscience.sqlbuilder.Condition... cs) {
    com.healthmarketscience.sqlbuilder.UpdateQuery $ = new com.healthmarketscience.sqlbuilder.UpdateQuery(SQLDatabase.SQLDatabaseEntities.WorkersTable.table);
    for (int ¢ = 0; ¢ < (cs.length); ++¢)
        $.addCondition(cs[¢]);
    
    return $;
}
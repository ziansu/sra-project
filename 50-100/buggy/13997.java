public static java.lang.String translateInsert(query_translation.DecodedQuery decodedQuery) {
    java.lang.StringBuilder sql = new java.lang.StringBuilder();
    query_translation.MatchClause createC = decodedQuery.getMc();
    sql = query_translation.SQLTranslate.translateInsertNodes(sql, createC);
    sql = query_translation.SQLTranslate.translateInsertEdges(sql, createC);
    java.lang.System.out.println(sql.toString());
    return sql.toString();
}
private static final com.nhb.common.predicate.sql.SqlPredicateThreadLocal getSqlPredicateThreadLocal(java.lang.String sql) {
    if (!(com.nhb.common.predicate.Predicates.sqlPredicateThreadLocalBySQL.containsKey(sql))) {
        synchronized(com.nhb.common.predicate.Predicates.sqlPredicateThreadLocalBySQL) {
            if (!(com.nhb.common.predicate.Predicates.sqlPredicateThreadLocalBySQL.containsKey(sql))) {
                com.nhb.common.predicate.Predicates.sqlPredicateThreadLocalBySQL.put(sql, new com.nhb.common.predicate.sql.SqlPredicateThreadLocal(sql));
            }
        }
    }
    return com.nhb.common.predicate.Predicates.sqlPredicateThreadLocalBySQL.get(sql);
}
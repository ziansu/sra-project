public <T> db.juhaku.juhakudb.filter.Query createWhereClause(db.juhaku.juhakudb.filter.Filter filter) {
    db.juhaku.juhakudb.filter.Root<T> root = new db.juhaku.juhakudb.filter.Root();
    db.juhaku.juhakudb.filter.Predicates predicates = new db.juhaku.juhakudb.filter.Predicates();
    filter.filter(root, predicates);
    java.lang.String[] args = new java.lang.String[0];
    java.lang.StringBuilder sql = new java.lang.StringBuilder();
    args = createWhere(args, sql, predicates);
    return new db.juhaku.juhakudb.filter.Query(sql.toString(), args);
}
protected leap.orm.sql.SqlStatement createQueryStatement(leap.orm.query.QueryContext qc, java.lang.String sql) {
    leap.orm.sql.SqlClause clause = context.getQueryFactory().createQueryClause(dao, sql);
    if (null != (whereParameters)) {
        return clause.createQueryStatement(qc, whereParameters);
    }else {
        return clause.createQueryStatement(qc, params());
    }
}
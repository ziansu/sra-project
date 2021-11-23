private void parseWhere(org.durid.sql.ast.expr.SQLBinaryOpExpr expr, org.durid.sql.ast.expr.SQLBinaryOpExpr sub, org.nlpcn.es4sql.parse.Where where) throws org.nlpcn.es4sql.exception.SqlParseException {
    if (isCond(sub)) {
        explanCond(expr.operator.name, sub, where);
    }else {
        if ((sub.operator.priority) < (expr.operator.priority)) {
            org.nlpcn.es4sql.parse.Where subWhere = new org.nlpcn.es4sql.parse.Where(expr.getOperator().name);
            where.addWhere(subWhere);
            parseWhere(sub, subWhere);
        }else {
            parseWhere(sub, where);
        }
    }
}
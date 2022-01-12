public com.alibaba.druid.sql.ast.SQLExpr notRationalRest(com.alibaba.druid.sql.ast.SQLExpr expr) {
    if (identifierEquals("REGEXP")) {
        lexer.nextToken();
        com.alibaba.druid.sql.ast.SQLExpr rightExp = primary();
        rightExp = relationalRest(rightExp);
        return new com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr(expr, com.alibaba.druid.sql.ast.expr.SQLBinaryOperator.NotRegExp, rightExp);
    }
    return super.notRationalRest(expr);
}
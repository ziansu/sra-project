public com.alibaba.druid.sql.ast.SQLExpr relationalRest(com.alibaba.druid.sql.ast.SQLExpr expr) {
    if (identifierEquals("REGEXP")) {
        lexer.nextToken();
        com.alibaba.druid.sql.ast.SQLExpr rightExp = equality();
        rightExp = relationalRest(rightExp);
        return new com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr(expr, com.alibaba.druid.sql.ast.expr.SQLBinaryOperator.RegExp, rightExp);
    }
    if (identifierEquals("RLIKE")) {
        lexer.nextToken();
        com.alibaba.druid.sql.ast.SQLExpr rightExp = equality();
        rightExp = relationalRest(rightExp);
        return new com.alibaba.druid.sql.ast.expr.SQLBinaryOpExpr(expr, com.alibaba.druid.sql.ast.expr.SQLBinaryOperator.RegExp, rightExp);
    }
    return super.relationalRest(expr);
}
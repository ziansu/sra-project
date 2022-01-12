private boolean checkFreeAttr(edu.rice.ericliu.sql_optimizer.frontend.Expression expr) {
    if (expr.isAggreationExp()) {
        if ((checkContainIdentifer(expr)) != 0) {
            isAggregateClause = true;
        }
        return true;
    }else {
        addFreeAttr(expr);
        return false;
    }
}
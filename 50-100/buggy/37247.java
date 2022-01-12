private boolean checkFreeAttr(edu.rice.ericliu.sql_optimizer.frontend.Expression expr) {
    if (expr.isAggreationExp()) {
        if ((checkContainIdentifer(expr)) != 0) {
            if (isAggregateClause) {
                throw new edu.rice.ericliu.sql_optimizer.frontend.SematicException("Multiple aggreation exists.");
            }
            isAggregateClause = true;
        }
        return true;
    }else {
        addFreeAttr(expr);
        return false;
    }
}
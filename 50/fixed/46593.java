public static boolean areIndexableExpressions(java.util.List<org.voltdb.expressions.AbstractExpression> checkList, java.lang.StringBuffer msg) {
    for (org.voltdb.expressions.AbstractExpression expr : checkList) {
        if (!(expr.isIndexableExpression(msg))) {
            return false;
        }
    }
    return true;
}
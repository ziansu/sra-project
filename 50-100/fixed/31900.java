public static boolean compareStop(org.matheclipse.core.interfaces.IAST ast, java.util.function.Predicate<org.matheclipse.core.interfaces.IExpr> stopPredicate) {
    int size = ast.size();
    for (int i = 1; i < size; i++) {
        if (stopPredicate.test(ast.get(i))) {
            return true;
        }
    }
    return false;
}
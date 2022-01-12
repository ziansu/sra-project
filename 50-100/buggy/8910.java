protected static org.matheclipse.core.interfaces.IExpr sortResults(org.matheclipse.core.interfaces.IAST resultList) {
    for (int i = 1; i < (resultList.size()); i++) {
        if (resultList.get(i).isList()) {
            org.matheclipse.core.eval.EvalAttributes.sort(((org.matheclipse.core.interfaces.IAST) (resultList.get(i))));
        }
    }
    return resultList;
}
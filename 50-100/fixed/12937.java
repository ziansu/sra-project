@java.lang.Override
public org.exist.xquery.value.Sequence postEval(org.exist.xquery.value.Sequence seq) throws org.exist.xquery.XPathException {
    if ((orderedResult) == null) {
        return seq;
    }
    orderedResult.sort();
    org.exist.xquery.value.Sequence result = orderedResult;
    orderedResult = null;
    if ((getReturnExpression()) instanceof org.exist.xquery.FLWORClause) {
        result = ((org.exist.xquery.FLWORClause) (getReturnExpression())).postEval(seq);
    }
    return super.postEval(result);
}
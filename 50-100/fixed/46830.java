@java.lang.Override
protected com.ibm.wala.cast.tree.CAstNode visitComparisonExpression(com.facebook.presto.sql.tree.ComparisonExpression node, sqlAnalysis.PrestoVisitor.Context context) {
    sqlAnalysis.PrestoVisitor.Context c = new sqlAnalysis.PrestoVisitor.Context(context);
    c.setComparison(true);
    return factory.makeNode(CAstNode.BINARY_EXPR, sqlAnalysis.PrestoVisitor.processOp(node.getType().getValue()), sqlAnalysis.PrestoVisitor.process(node.getLeft(), c), sqlAnalysis.PrestoVisitor.process(node.getRight(), c));
}
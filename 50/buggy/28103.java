@java.lang.Override
protected com.ibm.wala.cast.tree.CAstNode visitExists(com.facebook.presto.sql.tree.ExistsPredicate node, sqlAnalysis.PrestoVisitor.Context context) {
    sqlAnalysis.PrestoVisitor.Context c = new sqlAnalysis.PrestoVisitor.Context(context);
    c.setExists(true);
    return factory.makeNode(CAstNode.IF_EXPR, visitQuery(node.getSubquery(), c));
}
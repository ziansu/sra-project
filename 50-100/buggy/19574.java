public boolean visit(com.alibaba.druid.sql.visitor.SQLNumberExpr x) {
    if ((this.parameterized) && (com.alibaba.druid.sql.visitor.ParameterizedOutputVisitorUtils.checkParameterize(x))) {
        print('?');
        incrementReplaceCunt();
        if ((this) instanceof com.alibaba.druid.sql.visitor.ExportParameterVisitor) {
            com.alibaba.druid.sql.visitor.ExportParameterVisitorUtils.exportParameter(this.getParameters(), x);
        }
        return false;
    }
    return com.alibaba.druid.sql.visitor.SQLASTOutputVisitorUtils.visit(this, x);
}
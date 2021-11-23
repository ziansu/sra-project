public tsdb.component.labeledproperty.Formula createExpression(int pos, org.antlr.v4.runtime.tree.ParseTree[] parseTrees) {
    tsdb.component.labeledproperty.Formula f1 = parseTrees[pos].accept(tsdb.component.labeledproperty.FormulaCompileVisitor.DEFAULT);
    if (pos == 0) {
        return f1;
    }
    org.antlr.v4.runtime.tree.ParseTree op = parseTrees[(pos - 1)];
    tsdb.component.labeledproperty.Formula f0 = createTerm((pos - 2), parseTrees);
    return op.accept(new tsdb.component.labeledproperty.FormulaCompileVisitor.FormulaExpressionVisitor(f0, f1));
}
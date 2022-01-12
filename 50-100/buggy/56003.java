@java.lang.Override
public void visit(net.sf.jsqlparser.expression.operators.relational.EqualsTo arg0) {
    arg0.getRightExpression().accept(this);
    arg0.getLeftExpression().accept(this);
    result = (result) && ((TreeStack.pop()) == (TreeStack.pop()));
}
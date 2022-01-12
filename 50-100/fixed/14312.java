@java.lang.Override
public boolean visit(final org.eclipse.jdt.core.dom.TypeLiteral node) {
    final int startLine = this.getStartLineNumber(node);
    final int endLine = this.getEndLineNumber(node);
    final yoshikihigo.tinypdg.pe.ProgramElementInfo expression = new yoshikihigo.tinypdg.pe.ExpressionInfo(ExpressionInfo.CATEGORY.TypeLiteral, startLine, endLine);
    this.stack.push(expression);
    expression.setText(node.toString());
    return false;
}
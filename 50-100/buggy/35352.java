@java.lang.Override
public void endVisit(org.eclipse.jdt.core.dom.Assignment node) {
    java.lang.System.out.println(node.toString());
    org.eclipse.jdt.core.dom.Expression expressionLeft = node.getLeftHandSide();
    org.eclipse.jdt.core.dom.Expression expressionRight = node.getRightHandSide();
    metrics22.Assign assign = new metrics22.Assign(node.getStartPosition(), node.getLength(), node.toString());
    assigns.add(assign);
    super.endVisit(node);
}
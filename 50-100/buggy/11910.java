@java.lang.Override
public boolean visit(org.eclipse.php.internal.core.compiler.ast.visitor.PHPCallExpression node) throws java.lang.Exception {
    if ((node.getReceiver()) != null) {
        node.getReceiver().traverse(this);
    }
    if ((node.getArgs()) != null) {
        node.getArgs().traverse(this);
    }
    return visitGeneral(node);
}
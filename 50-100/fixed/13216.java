@java.lang.Override
public kalang.core.Type visit(kalang.ast.AstNode node) {
    if (node == null)
        return null;
    
    if ((node instanceof kalang.ast.Statement) && (returned)) {
        err.fail("unabled to reach statement", AstSemanticError.LACKS_OF_STATEMENT, node);
        return null;
    }
    java.lang.Object ret = super.visit(node);
    if (ret instanceof kalang.core.Type) {
        types.put(node, ((kalang.core.Type) (ret)));
        return ((kalang.core.Type) (ret));
    }
    return null;
}
@java.lang.Override
public java.lang.Void exec(com.google.template.soy.exprtree.ExprNode node) {
    com.google.common.base.Preconditions.checkArgument((node instanceof com.google.template.soy.exprtree.ExprRootNode));
    visit(node);
    return null;
}
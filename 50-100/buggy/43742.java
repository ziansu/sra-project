@java.lang.Override
public java.lang.Object getValueAt(java.lang.Object node, int column) {
    final com.puppycrawl.tools.checkstyle.api.DetailAST ast = ((com.puppycrawl.tools.checkstyle.api.DetailAST) (node));
    switch (column) {
        case 0 :
            return null;
        case 1 :
            return com.puppycrawl.tools.checkstyle.utils.TokenUtils.getTokenName(ast.getType());
        case 2 :
            return ast.getLineNo();
        case 3 :
            return ast.getColumnNo();
        case 4 :
            return ast.getText();
        default :
            return null;
    }
}
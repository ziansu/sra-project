@java.lang.Override
public java.lang.Object getValueAt(java.lang.Object node, int column) {
    final com.puppycrawl.tools.checkstyle.api.DetailAST ast = ((com.puppycrawl.tools.checkstyle.api.DetailAST) (node));
    java.lang.Object value;
    switch (column) {
        case 1 :
            value = com.puppycrawl.tools.checkstyle.utils.TokenUtils.getTokenName(ast.getType());
            break;
        case 2 :
            value = ast.getLineNo();
            break;
        case 3 :
            value = ast.getColumnNo();
            break;
        case 4 :
            value = ast.getText();
            break;
        default :
            value = null;
    }
    return value;
}
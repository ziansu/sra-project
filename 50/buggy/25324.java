private int getPostion(org.eclipse.php.internal.core.ast.rewrite.Program root, int line, int column) {
    return (root.getPosition(line, column)) - 1;
}
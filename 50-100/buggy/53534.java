private void rekInsert(assignmentDS.util.MyBinTree<T>.Node ast, T data) {
    if ((ast.left) == null) {
        ast.left = new Node(data);
    }else
        if ((ast.right) == null) {
            ast.right = new Node(data);
        }else {
            if ((ast.left.getChildCount()) < (ast.right.getChildCount())) {
                rekInsert(ast.left, data);
            }else {
                rekInsert(ast.right, data);
            }
        }
    
}
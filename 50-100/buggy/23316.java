public static Tree.TreeNode findLastChild(Tree.TreeNode t) {
    if (!(t.getChildren().get(0).getChildren().isEmpty())) {
        SymbolTable.HashMapTable.findLastChild(t.getChildren().get(0));
    }else {
        java.lang.System.out.println(t.getChildren().get(0).getData());
        return t.getChildren().get(0);
    }
    return t;
}
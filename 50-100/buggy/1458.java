public static boolean addVarDeclToCorrectScope(Tree.TreeNode t) {
    if (SymbolTable.HashMapTable.findParentBlock(t).equals(("block" + (SymbolTable.HashMapTable.scopeCounter)))) {
        java.lang.System.out.println(SymbolTable.HashMapTable.scopeCounter);
        SymbolTable.HashMapTable.hashArray.get(((SymbolTable.HashMapTable.scopeCounter) - 1)).put(t.getChildren().get(1).getData(), t.getChildren().get(0).getData());
        return true;
    }else {
        (SymbolTable.HashMapTable.scopeCounter)--;
        return false;
    }
}
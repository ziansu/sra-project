private TreeNode init() {
    id();
    if ((tokenList.get(0).value()) == (TokId.TISKW)) {
        java.lang.System.out.println(tokenList.get(0));
        tokenList.remove(0);
        return new TreeNode(Node.NINIT, expr());
    }
    return null;
}
private TreeNode exprtail(TreeNode term) {
    Token current = tokenList.get(0);
    if ((current.value()) == (TokId.TADDT)) {
        tokenList.remove(0);
        return new TreeNode(Node.NADD, term, term());
    }
    if ((current.value()) == (TokId.TSUBT)) {
        tokenList.remove(0);
        return new TreeNode(Node.NSUB, term, term());
    }
    return null;
}
private TreeNode program() {
    TreeNode program = new TreeNode(Node.NPROG);
    if ((tokenList.get(0).value()) == (TokId.TCD)) {
        tokenList.remove(0);
        id();
        program.setLeft(globals());
        program.setMiddle(funcs());
        program.setRight(mainbody());
        return program;
    }
    return null;
}
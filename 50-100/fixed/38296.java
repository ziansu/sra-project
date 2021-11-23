public static io.github.emanuelpalm.plisp.front.parser.TreeNode of(final io.github.emanuelpalm.plisp.front.lexer.Token t, final io.github.emanuelpalm.plisp.front.parser.TreeNode.List args) {
    final java.util.List<io.github.emanuelpalm.plisp.front.parser.TreeNode> ts = args.nodes();
    return (ts.size()) > 0 ? new io.github.emanuelpalm.plisp.front.parser.TreeNode.Call(t, ts.get(0), new io.github.emanuelpalm.plisp.front.parser.TreeNode.List(t, ts.subList(1, ts.size()))) : new io.github.emanuelpalm.plisp.front.parser.TreeNode.Void(t);
}
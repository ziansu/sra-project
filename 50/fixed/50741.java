@java.lang.Override
public io.github.emanuelpalm.plisp.front.parser.TreeNode evaluate(final io.github.emanuelpalm.plisp.front.parser.TreeSymbolTable t) {
    return ((io.github.emanuelpalm.plisp.front.parser.TreeNode.Callable) (function.evaluate(t))).evaluate(t, arguments);
}
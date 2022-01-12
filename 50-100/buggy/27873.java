@java.lang.Override
public boolean addDisputableNodes(java.util.Stack<mhfc.net.common.util.parsing.syntax.tree.UnaryAST.IntermediateNode> stack) {
    if ((getValue()) == null) {
        if (!(isPrefix())) {
            getOperatorNode().addDisputableNodes(stack);
        }
        return true;
    }
    boolean childrenResult = getRightMostNode().addDisputableNodes(stack);
    if (!childrenResult) {
        stack.add(0, this);
    }
    return childrenResult;
}
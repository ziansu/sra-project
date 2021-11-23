@java.lang.Override
public void visitAssign(com.sun.tools.javac.tree.JCTree.JCAssign tree) {
    isLefts.add(isLeft);
    isLeft = true;
    tree.lhs = translate(tree.lhs);
    isLeft = false;
    tree.rhs = translate(tree.rhs);
    isLeft = isLefts.remove(((isLefts.size()) - 1));
    result = tree;
}
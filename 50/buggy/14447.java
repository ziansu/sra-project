@java.lang.Override
public com.google.errorprone.matchers.Description matchClass(com.sun.source.tree.ClassTree tree, com.google.errorprone.VisitorState state) {
    return checkDeclarations(tree, tree.getMembers(), state);
}
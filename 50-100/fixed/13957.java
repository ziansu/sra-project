private boolean inPhantomNode(com.github.javaparser.ast.Node node) {
    return (node.getParentNode().isPresent()) && ((isPhantomNode(node.getParentNode().get())) || (inPhantomNode(node.getParentNode().get())));
}
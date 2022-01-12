private static boolean inPhantomNode(com.github.javaparser.ast.Node node, int levels) {
    return (node.getParentNode().isPresent()) && ((com.github.javaparser.printer.lexicalpreservation.PhantomNodeLogic.isPhantomNode(node.getParentNode().get())) || (com.github.javaparser.printer.lexicalpreservation.PhantomNodeLogic.inPhantomNode(node.getParentNode().get(), (levels - 1))));
}
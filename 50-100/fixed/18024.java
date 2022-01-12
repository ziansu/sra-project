@java.lang.Override
public void visit(final org.pegdown.ast.SimpleNode node) {
    switch (node.getType()) {
        case Apostrophe :
            handler.putMark("'", node.getEndIndex());
            break;
        case Ellipsis :
            handler.putMark("\u2026", node.getEndIndex());
            break;
        default :
            break;
    }
}
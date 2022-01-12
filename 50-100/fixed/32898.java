private void writeCommaSeparatedList(final java.lang.Iterable<? extends com.strobel.decompiler.languages.java.AstNode> list) {
    boolean isFirst = true;
    for (final com.strobel.decompiler.languages.java.AstNode node : list) {
        if (isFirst) {
            isFirst = false;
        }else {
            comma(node);
        }
        node.acceptVisitor(this, null);
    }
}
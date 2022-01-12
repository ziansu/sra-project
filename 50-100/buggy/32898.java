private void writeCommaSeparatedList(final java.lang.Iterable<? extends com.strobel.decompiler.languages.java.AstNode> list, boolean isGeneric) {
    boolean isFirst = true;
    for (final com.strobel.decompiler.languages.java.AstNode node : list) {
        if (isFirst) {
            isFirst = false;
        }else {
            comma(node);
        }
        if (isGeneric)
            processTypeParameterDeclaration(((com.strobel.decompiler.languages.java.TypeParameterDeclaration) (node)), null, isGeneric);
        else
            node.acceptVisitor(this, null);
        
    }
}
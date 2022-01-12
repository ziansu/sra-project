public static boolean isNotPropertyStart(final com.intellij.psi.tree.IElementType elementType) {
    return ((!(JSTokenTypes.IDENTIFIER_TOKENS_SET.contains(elementType))) && (elementType != (com.intellij.lang.javascript.JSTokenTypes.STRING_LITERAL))) && (elementType != (com.intellij.lang.javascript.JSTokenTypes.NUMERIC_LITERAL));
}
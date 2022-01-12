protected boolean checkMatches(final com.intellij.lang.PsiBuilder builder, final com.intellij.psi.tree.IElementType token, final java.lang.String message) {
    if ((builder.getTokenType()) == token) {
        builder.advanceLexer();
        return true;
    }else {
        builder.error(message);
        return false;
    }
}
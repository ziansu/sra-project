private static boolean isSingleLineDefault(com.puppycrawl.tools.checkstyle.api.DetailAST literalDefault) {
    boolean result = false;
    final com.puppycrawl.tools.checkstyle.api.DetailAST slist = literalDefault.getNextSibling();
    if (slist == null) {
        result = true;
    }else {
        final com.puppycrawl.tools.checkstyle.api.DetailAST block = slist.getFirstChild();
        if ((block != null) && ((block.getType()) != (com.puppycrawl.tools.checkstyle.api.TokenTypes.SLIST))) {
            result = (literalDefault.getLineNo()) == (block.getLineNo());
        }
    }
    return result;
}
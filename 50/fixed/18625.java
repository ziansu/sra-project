public com.dickimawbooks.texparserlib.latex.TeXObjectList expandonce(com.dickimawbooks.texparserlib.latex.TeXParser parser, com.dickimawbooks.texparserlib.latex.TeXObjectList stack) throws java.io.IOException {
    stack.popArg(parser);
    stack.popArg(parser);
    return new com.dickimawbooks.texparserlib.latex.TeXObjectList();
}
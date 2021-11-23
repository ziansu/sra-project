public com.dickimawbooks.texparserlib.latex.TeXObjectList expandonce(com.dickimawbooks.texparserlib.latex.TeXParser parser) throws java.io.IOException {
    parser.popNextArg();
    parser.popNextArg();
    return new com.dickimawbooks.texparserlib.latex.TeXObjectList();
}
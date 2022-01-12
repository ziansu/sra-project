private org.python.pydev.parser.fastparser.ScopesParser.Scopes createScopes() throws org.python.pydev.core.docutils.SyntaxErrorException {
    int globalScope = this.scopes.startScope(0, org.python.pydev.parser.fastparser.ScopesParser.Scopes.TYPE_MODULE);
    int offset = createInternalScopes(org.python.pydev.core.docutils.ParsingUtils.create(doc, true), 0);
    this.scopes.endScope(globalScope, offset, org.python.pydev.parser.fastparser.ScopesParser.Scopes.TYPE_MODULE);
    return this.scopes;
}
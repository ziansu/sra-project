public org.json.JSONObject compile(java.lang.String bqlStmt) throws org.antlr.runtime.RecognitionException {
    org.antlr.runtime.ANTLRStringStream input = new org.antlr.runtime.ANTLRStringStream(bqlStmt);
    org.antlr.runtime.TokenStream tokens = new org.antlr.runtime.CommonTokenStream(new com.sensei.bql.parsers.BQLLexer(input));
    _parser = new com.sensei.bql.parsers.BQLParser(tokens, _facetInfoMap);
    BQLParser.statement_return ret = _parser.statement();
    org.antlr.runtime.tree.CommonTree ast = ((org.antlr.runtime.tree.CommonTree) (ret.tree));
    org.json.JSONObject json = ((org.json.JSONObject) (ret.json));
    java.lang.System.out.println((">>> json = " + (json.toString())));
    return json;
}
public com.github.sommeri.less4j.core.ast.IndirectVariable buildFromIndirectVariable(org.antlr.v4.runtime.tree.ParseTree expressionToken, org.antlr.v4.runtime.tree.ParseTree variableToken) {
    if (expressionToken != null) {
        return new com.github.sommeri.less4j.core.ast.IndirectVariable(toToken(expressionToken), variableToken.getText().substring(1));
    }
    return new com.github.sommeri.less4j.core.ast.IndirectVariable(toToken(variableToken), variableToken.getText().substring(1));
}
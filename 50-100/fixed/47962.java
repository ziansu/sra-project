private ashc.grammar.Node.NodeEnumBlock parseEnumBlock() throws ashc.grammar.Parser.GrammarException {
    final java.util.LinkedList<ashc.grammar.Node.NodeEnumInstance> instances = new java.util.LinkedList<ashc.grammar.Node.NodeEnumInstance>();
    instances.add(parseEnumInstance());
    while ((getNext().type) == (ashc.grammar.Lexer.TokenType.COMMA))
        instances.add(parseEnumInstance());
    
    rewind();
    return new ashc.grammar.Node.NodeEnumBlock(line, column, instances, parseClassBlock(true));
}
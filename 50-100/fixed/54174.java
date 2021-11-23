@java.lang.SuppressWarnings(value = "unchecked")
public static java.util.List<net.alloyggp.griddle.grammar.TopLevelGdl> parse(java.io.Reader input) throws java.lang.Exception {
    java_cup.runtime.Scanner lexer = new net.alloyggp.griddle.generated.GdlScanner(input);
    java_cup.runtime.SymbolFactory symbolFactory = new java_cup.runtime.DefaultSymbolFactory();
    java_cup.runtime.Symbol result = new net.alloyggp.griddle.generated.GdlParser(lexer, symbolFactory).parse();
    input.close();
    return ((java.util.List<net.alloyggp.griddle.grammar.TopLevelGdl>) (result.value));
}
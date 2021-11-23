public static void main(java.lang.String[] args) {
    java.lang.String pattern = "^a$";
    regexcompiler.MyPattern.Tokeniser t = new regexcompiler.MyPattern.Tokeniser(pattern);
    java.util.List<regexcompiler.RegexToken> tokenList = t.tokenise();
    regexcompiler.MyPattern.Parser p = new regexcompiler.MyPattern.Parser(pattern, tokenList);
    regexcompiler.ParseTree parseTree = p.parse();
    java.lang.System.out.println(parseTree);
    nfa.NFAGraph resultGraph = regexcompiler.MyPattern.toNFAGraph(pattern, NFAConstruction.JAVA);
    java.lang.System.out.println(resultGraph);
}
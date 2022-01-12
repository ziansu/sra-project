public static void main(java.lang.String[] arguments) throws java.lang.Exception {
    Avans.Util.LinkedList<Avans.Tokenizer.Token> tokenList = new Avans.Util.LinkedList<Avans.Tokenizer.Token>();
    Avans.Util.LinkedList<Avans.Compiler.Node.RunNode> runList = new Avans.Util.LinkedList<Avans.Compiler.Node.RunNode>();
    Avans.DesignPatterns2.Main.createTokenList(tokenList, "..\\JarkHunt\\src\\script2.txt");
    if ((tokenList.getFirst()) != null) {
        Avans.DesignPatterns2.Main.testTokenList(tokenList);
    }
}
public static void main(java.lang.String[] arguments) throws java.io.IOException {
    Avans.Util.LinkedList<Avans.Tokenizer.Token> tokenList = new Avans.Util.LinkedList<Avans.Tokenizer.Token>();
    Avans.Util.LinkedList<Avans.Compiler.Node.RunNode> runList = new Avans.Util.LinkedList<Avans.Compiler.Node.RunNode>();
    try {
        Avans.DesignPatterns2.Main.createTokenList(tokenList, "..\\JarkHunt\\src\\script2.txt");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    if ((tokenList.getFirst()) != null) {
        Avans.DesignPatterns2.Main.testTokenList(tokenList);
    }
}
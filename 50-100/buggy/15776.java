public static void main(java.lang.String[] args) {
    Lexer lexer;
    try {
        lexer = new Lexer(new java.io.FileReader(args[0]));
        try {
            Parser parser = new Parser(lexer);
            Symbol result = parser.parse();
            if (!(parser.syntaxErrors)) {
                java.lang.System.out.println("parsing successful");
            }
        } catch (java.lang.Exception e) {
        }
    } catch (java.io.FileNotFoundException e1) {
        e1.printStackTrace();
    }
}
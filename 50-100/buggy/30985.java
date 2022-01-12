public static void Main(java.lang.String[] test) throws java.lang.Exception {
    scanner.IScanner scanner = scanner.StdInputScanner.getStdInputScanner();
    scanner.Tokenizer tokenizer = new scanner.Tokenizer();
    parser.Parser parser = new parser.Parser(new scanner.TokenizerAdapter(scanner, tokenizer));
    while (parser.hasNext()) {
        try {
            java.lang.System.out.println(parser.getNextExcepression());
        } catch (parser.ParsingException pe) {
            java.lang.System.out.println(pe.getMessage());
            break;
        }
    } 
}
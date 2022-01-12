public static void main(java.lang.String[] args) {
    Scanner.TigerScanner scanner = new Scanner.TigerScanner(main.fileLocation);
    Parser.TigerParser parser = new Parser.TigerParser(main.fileLocation);
    while (!(scanner.atEnd())) {
        Scanner.Token.Token token = scanner.getToken();
    } 
    java.lang.System.out.println(("Successful parse: " + (parser.successfulParse())));
}
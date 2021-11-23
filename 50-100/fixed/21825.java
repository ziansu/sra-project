static expression.While parse() {
    expression.While whileELSE = null;
    scanner.get();
    expression.Compare compare = expression.Compare.parse();
    expression.Token t = scanner.getCurrentToken();
    if (!(t instanceof expression.LeftBracketToken)) {
        java.lang.System.out.println("Error: While Parsing");
    }
    expression.StatementList stateList = expression.StatementList.parse();
    whileELSE = new expression.While(compare, stateList);
    return whileELSE;
}
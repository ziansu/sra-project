static expression.If parse() {
    expression.If ifELSE = null;
    scanner.get();
    scanner.get();
    expression.Compare compare = expression.Compare.parse();
    expression.Token t = scanner.getCurrentToken();
    if (!(t instanceof expression.LeftBracketToken)) {
        java.lang.System.out.print("Error: If Parsing");
    }
    expression.StatementList stateList = expression.StatementList.parse();
    ifELSE = new expression.If(compare, stateList);
    return ifELSE;
}
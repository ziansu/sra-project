public static sal.small.Tree.Tree<sal.small.Token.Token> printStatement() {
    scan();
    sal.small.Tree.Tree<sal.small.Token.Token> printList = list(sal.small.STATEMENTLIST);
    do {
        sal.small.Tree.Tree<sal.small.Token.Token> printExpr;
        if ((currentToken()) == (STRING)) {
            printExpr = leaf(sal.small.STRING, currentText());
            scan();
        }else {
            printExpr = sal.small.Parse.expression();
        }
        printList.addChild(list(sal.small.PRINT, printExpr));
    } while (skipToken(sal.small.COMMA) );
    return printList;
}
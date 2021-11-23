protected void nextAssignmentOrCallStatement() {
    enter("assignment or call statement");
    nextExpected(nameToken);
    switch (scanner.getToken()) {
        case openParenToken :
            {
                scanner.nextToken();
                nextArguments();
                nextExpected(closeParenToken);
                break;
            }
        case openBracketToken :
            {
                scanner.nextToken();
                nextExpression();
                nextExpected(closeBracketToken);
            }
        case colonEqualToken :
            {
                scanner.nextToken();
                nextExpression();
                break;
            }
    }
    exit("assignment or call statement");
}
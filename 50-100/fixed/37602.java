protected void nextAssignmentOrCallStatement() {
    enter("assignment or call statement");
    nextExpected(nameToken);
    switch (scanner.getToken()) {
        case openParenToken :
            {
                nextArguments();
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
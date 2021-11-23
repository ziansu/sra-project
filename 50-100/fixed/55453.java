private com.company.fail.Expr ternary() {
    com.company.fail.Expr expr = equality();
    while (match(com.company.fail.QUESTION_MARK)) {
        com.company.fail.Token operator = previous();
        com.company.fail.Expr right = equality();
        if (!(match(com.company.fail.COLON)))
            throw error(peek(), "Missing ':' in ternary expression.");
        
        com.company.fail.Expr rightRight = equality();
        expr = new com.company.fail.Expr.Ternary(operator, expr, right, rightRight);
    } 
    return expr;
}
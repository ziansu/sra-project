public void addItem(com.github.gianlucanitti.javaexpreval.Expression item) throws com.github.gianlucanitti.javaexpreval.UnexpectedTokenException {
    if (expectOperator)
        throw new com.github.gianlucanitti.javaexpreval.UnexpectedTokenException(expectOperator, false);
    
    items.add(item);
    expectOperator = true;
}
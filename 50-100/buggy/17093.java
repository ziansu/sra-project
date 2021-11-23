public void pushClosingBracket() throws com.kamaek.calculator.evaluationstack.IncorrectBracketsSequence {
    if ((evaluationContext.contextsNumber()) < 2)
        throw new com.kamaek.calculator.evaluationstack.IncorrectBracketsSequence("expected opening bracket for closing bracket not found");
    
    java.util.Deque<com.kamaek.calculator.binaryoperator.BinaryOperator<com.kamaek.calculator.binaryoperator.BinaryOperator>> operators = evaluationContext.toPreviousContext();
    for (com.kamaek.calculator.binaryoperator.BinaryOperator<com.kamaek.calculator.binaryoperator.BinaryOperator> operator : operators) {
        double rightOperand = popNumber();
        double leftOperand = popNumber();
        pushNumber(popBinaryOperator().execute(leftOperand, rightOperand));
    }
}
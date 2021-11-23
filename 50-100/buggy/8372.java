private org.modeldriven.alf.fuml.mapping.expressions.ExpressionMapping mapOperand(org.modeldriven.alf.syntax.expressions.Expression operand) throws org.modeldriven.alf.mapping.MappingError {
    org.modeldriven.alf.fuml.mapping.expressions.ExpressionMapping operandMapping = null;
    org.modeldriven.alf.fuml.mapping.FumlMapping mapping = this.fumlMap(operand);
    if (!(mapping instanceof org.modeldriven.alf.fuml.mapping.expressions.ExpressionMapping)) {
        this.throwError(("Error mapping operand expression: " + (mapping.getErrorMessage())));
    }else {
        operandMapping = ((org.modeldriven.alf.fuml.mapping.expressions.ExpressionMapping) (mapping));
    }
    return operandMapping;
}
public static io.parsingdata.metal.expression.value.ValueExpression last(final io.parsingdata.metal.expression.value.reference.Ref operand) {
    return new io.parsingdata.metal.expression.value.reference.Last(new io.parsingdata.metal.expression.value.reference.Ref(operand.reference, 1));
}
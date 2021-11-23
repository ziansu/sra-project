public java.lang.String visitSubtraction(printer.Subtraction subtraction) {
    return ((("(" + (visit(subtraction.leftHandSide))) + " - ") + (visit(subtraction.rightHandSide))) + ")";
}
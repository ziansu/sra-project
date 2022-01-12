public double getEstimatedLength() {
    return ((operands.size()) * (java.lang.Math.log(operands.size()))) + ((operators.size()) * (java.lang.Math.log(operators.size())));
}
public double getEstimatedLength() {
    if (((operands.size()) != 0) && ((operators.size()) != 0)) {
        return ((operands.size()) * (java.lang.Math.log(operands.size()))) + ((operators.size()) * (java.lang.Math.log(operators.size())));
    }else {
        return 0;
    }
}
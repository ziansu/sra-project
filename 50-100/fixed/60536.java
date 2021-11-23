@java.lang.Override
public Expression derivative(Variable var) {
    if ((this.exponent) == 0) {
        return new Constant(0);
    }
    double newExponent = (this.exponent) - 1;
    return new Multiplication(new Constant(this.exponent), new Multiplication(new Power(this.base, newExponent), this.base.derivative(var)));
}
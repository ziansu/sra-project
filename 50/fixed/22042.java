@java.lang.Override
public org.ejml.simple.SimpleMatrix computeError(org.ejml.simple.SimpleMatrix Y) {
    error = Y.minus(output).elementMult(activation.derivative(input.mult(thetas)));
    return Y.minus(output);
}
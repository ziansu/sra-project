public double angle() {
    org.apache.commons.math3.complex.Complex c = new org.apache.commons.math3.complex.Complex(real, imaginary);
    double d = c.getArgument();
    return d;
}
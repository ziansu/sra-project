@java.lang.Override
public org.apache.commons.math3.complex.Complex getValue(org.apache.commons.math3.complex.Complex x) {
    return x.pow(n).subtract(Complex.ONE);
}
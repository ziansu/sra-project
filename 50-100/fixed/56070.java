public static in.tamchow.fractal.math.complex.Complex random(in.tamchow.fractal.math.complex.Complex lowerBound, in.tamchow.fractal.math.complex.Complex upperBound) {
    double modulusRange = (upperBound.modulus()) - (lowerBound.modulus());
    double argRange = (upperBound.arg()) - (lowerBound.arg());
    double randomModulus = (java.lang.Math.random()) * modulusRange;
    double randomArg = (java.lang.Math.random()) * argRange;
    return new in.tamchow.fractal.math.complex.Complex(randomModulus, randomArg, true);
}
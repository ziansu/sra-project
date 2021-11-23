public double multiply(es.upm.miw.forge.ecp2.Fraction fractionToMultiply) {
    double newNumerator = (this.getNumerator()) * (fractionToMultiply.getNumerator());
    double newDenominator = (this.getDenominator()) * (fractionToMultiply.getDenominator());
    double newFraction = newNumerator / newDenominator;
    return newFraction;
}
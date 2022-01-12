public es.upm.miw.forge.ecp2.Fraction multiply(es.upm.miw.forge.ecp2.Fraction fractionToMultiply) {
    int newNumerator = (this.getNumerator()) * (fractionToMultiply.getNumerator());
    int newDenominator = (this.getDenominator()) * (fractionToMultiply.getDenominator());
    newFraction = new es.upm.miw.forge.ecp2.Fraction(newNumerator, newDenominator);
    return newFraction;
}
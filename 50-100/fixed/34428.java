public de.mfo.jsurf.algebra.XYZPolynomial visit(de.mfo.jsurf.algebra.PolynomialDoubleDivision pdd, java.lang.Void param) {
    de.mfo.jsurf.algebra.XYZPolynomial dividend = pdd.dividend.accept(this, ((java.lang.Void) (null)));
    double divisor = pdd.divisor.accept(this.valueCalculator, ((java.lang.Void) (null)));
    return dividend.mult((1.0 / divisor));
}
@org.openscience.cdk.annotations.TestMethod(value = "testGetNaturalExactMass_IMolecularFormula")
public static double getNaturalExactMass(org.openscience.cdk.interfaces.IMolecularFormula formula) {
    double mass = 0.0;
    org.openscience.cdk.config.IsotopeFactory factory;
    try {
        factory = org.openscience.cdk.config.Isotopes.getInstance();
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("Could not instantiate the IsotopeFactory.");
    }
    for (org.openscience.cdk.interfaces.IIsotope isotope : formula.isotopes()) {
        org.openscience.cdk.interfaces.IElement isotopesElement = isotope.getBuilder().newInstance(org.openscience.cdk.interfaces.IElement.class, isotope);
        mass += (factory.getNaturalMass(isotopesElement)) * (formula.getIsotopeCount(isotope));
    }
    return mass;
}
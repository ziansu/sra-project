@org.testng.annotations.Test
public void checkElement() {
    se.raddo.raddose3D.Element s = new se.raddo.raddose3D.Element("S", 16, getSulphur());
    se.raddo.raddose3D.tests.Assertion.equals(s.getAtomicNumber(), 16, "atomic number");
    se.raddo.raddose3D.tests.Assertion.equals(s.getAtomicWeight(), 32.066, "atomic weight");
    se.raddo.raddose3D.tests.Assertion.equals(s.getAtomicWeightInGrams(), 5.3246841E-23, "atomic weight (g)");
    se.raddo.raddose3D.tests.Assertion.equals(s.getElementName(), "S", "element name");
    sulphurTests(s);
}
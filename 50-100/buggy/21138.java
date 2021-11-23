@org.junit.Test
public void testLengths() throws java.io.IOException, org.biojava.bio.structure.StructureException {
    java.lang.String pdbId = "1w0p";
    java.lang.String rangeStr = "A:25-26";
    org.biojava.bio.structure.Atom[] atoms = cache.getAtoms(pdbId);
    org.biojava.bio.structure.AtomPositionMap map = new org.biojava.bio.structure.AtomPositionMap(atoms);
    org.biojava.bio.structure.ResidueRangeAndLength range = org.biojava.bio.structure.ResidueRangeAndLength.parse(rangeStr, map);
    org.junit.Assert.assertEquals(2, range.getLength());
}
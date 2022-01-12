@org.junit.Test
public void testWholeChainBasic() {
    java.lang.String range = "B:";
    org.biojava.bio.structure.ResidueRange rr = org.biojava.bio.structure.ResidueRange.parse(range);
    org.junit.Assert.assertEquals("Wrong chain Id", "B", rr.getChainId());
    org.junit.Assert.assertNull("Start residue should be null", rr.getStart());
    org.junit.Assert.assertNull("End residue should be null", rr.getEnd());
}
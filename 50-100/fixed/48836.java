@org.junit.Test
public void testWholeChainBasic() {
    java.lang.String range = "B:";
    org.biojava.bio.structure.ResidueRange rr = org.biojava.bio.structure.ResidueRange.parse(range);
    assertEquals("Wrong chain Id", "B", rr.getChainId());
    assertNull("Start residue should be null", rr.getStart());
    assertNull("End residue should be null", rr.getEnd());
}
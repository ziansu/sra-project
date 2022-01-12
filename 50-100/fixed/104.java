@org.testng.annotations.Test(expectedExceptions = org.broadinstitute.sting.utils.exceptions.UserException.class)
public void testGetIndexesOfRelevantAllelesWithNoALT() {
    final java.util.List<org.broadinstitute.sting.utils.variant.Allele> alleles1 = new java.util.ArrayList<>(1);
    alleles1.add(org.broadinstitute.sting.utils.variant.Allele.create("A", true));
    final java.util.List<org.broadinstitute.sting.utils.variant.Allele> alleles2 = new java.util.ArrayList<>(1);
    alleles2.add(org.broadinstitute.sting.utils.variant.Allele.create("A", true));
    org.broadinstitute.sting.utils.variant.GATKVariantContextUtils.getIndexesOfRelevantAlleles(alleles1, alleles2, (-1));
    org.testng.Assert.fail("We should have thrown an exception because the <ALT> allele was not present");
}
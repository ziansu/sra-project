@org.junit.Test
public final void testAddRIVsRandomIndexVectorArray() {
    final rivet.core.labels.ArrayRIV testRIVA = rivet.core.labels.ArrayRIV.generateLabel(100, 4, "token1");
    final rivet.core.labels.ArrayRIV testRIVB = rivet.core.labels.ArrayRIV.generateLabel(100, 4, "token2");
    org.junit.Assert.assertNotEquals(testRIVA, testRIVB);
    org.junit.Assert.assertEquals(testRIVA.add(testRIVB), rivet.core.labels.RIVs.addRIVs(testRIVA, testRIVB));
}
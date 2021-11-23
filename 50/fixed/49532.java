@org.junit.Test
public final void testSimilarity() {
    final rivet.core.labels.ArrayRIV testRIVA = rivet.core.labels.ArrayRIV.fromString("4|1.0 6|-1.0 10");
    assertEquals(1, rivet.core.labels.RIVs.similarity(testRIVA, testRIVA), 1.0E-6);
}
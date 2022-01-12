@org.junit.Test
public void testSetChordInversionsMultipleQuality() {
    com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest characteristics = new com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest();
    java.lang.String[] testChordInversionsNames = new java.lang.String[3];
    testChordInversionsNames[0] = "First Inversion";
    testChordInversionsNames[1] = "Second Inversion";
    testChordInversionsNames[2] = "First Inversion";
    characteristics.setChordInversions(testChordInversionsNames);
    java.util.HashSet<com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordInversion> inversions = characteristics.getChordInversions();
    assertEquals(2, inversions.size());
    assertTrue(inversions.contains(ChordInversion.FIRST_INV));
    assertTrue(inversions.contains(ChordInversion.SECOND_INV));
}
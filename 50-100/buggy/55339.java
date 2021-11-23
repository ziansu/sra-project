@org.junit.Test
public void testSetChordInversionsInvalidQuality() {
    com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest characteristics = new com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest();
    java.lang.String[] testChordInversionsNames = new java.lang.String[2];
    testChordInversionsNames[0] = "First Inversion";
    testChordInversionsNames[1] = "TEST";
    characteristics.setChordInversions(testChordInversionsNames);
    java.util.HashSet<com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordInversion> inversions = characteristics.getChordInversions();
    assertEquals(1, inversions.size());
    assertTrue(inversions.contains(ChordInversion.FIRST_INV));
}
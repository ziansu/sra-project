@org.junit.Test
public void testSetChordInversions() {
    com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest characteristics = new com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest();
    java.lang.String[] testChordInversionsNames = new java.lang.String[2];
    testChordInversionsNames[0] = "Root Position";
    testChordInversionsNames[1] = "Third Inversion";
    characteristics.setChordInversions(testChordInversionsNames);
    java.util.HashSet<com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordInversion> inversions = characteristics.getChordInversions();
    assertEquals(2, inversions.size());
    assertTrue(inversions.contains(ChordInversion.ROOT_POS));
    assertTrue(inversions.contains(ChordInversion.THIRD_INV));
}
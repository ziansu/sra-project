@org.junit.Test
public void testSetChordInversionsAll() {
    com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest characteristics = new com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest();
    java.lang.String[] testChordInversionsNames = new java.lang.String[1];
    testChordInversionsNames[0] = "all";
    characteristics.setChordInversions(testChordInversionsNames);
    java.util.HashSet<com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordInversion> inversions = characteristics.getChordInversions();
    com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordInversion[] allInversions = com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordInversion.values();
    assertEquals(allInversions.length, inversions.size());
    for (com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordInversion i : allInversions) {
        assertTrue(inversions.contains(i));
    }
}
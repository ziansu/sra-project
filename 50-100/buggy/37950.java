@org.junit.Test
public void testSetChordQualitiesAll() {
    com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest characteristics = new com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordCharacteristicsToTest();
    java.lang.String[] testChordQualitiesNames = new java.lang.String[1];
    testChordQualitiesNames[0] = "all";
    characteristics.setChordQualities(testChordQualitiesNames);
    java.util.HashSet<com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordQuality> qualities = characteristics.getChordQualities();
    com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordQuality[] allQualities = com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordQuality.values();
    assertEquals(allQualities.length, qualities.size());
    for (com.jcortez.musiceartrainer.rest.chordtrainer.model.ChordQuality q : allQualities) {
        assertTrue(qualities.contains(q));
    }
}
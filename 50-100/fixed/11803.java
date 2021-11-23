@org.junit.Test
public void testParseFileName() {
    for (com.google.code.tvrenamer.TVRenamerTest.TestInput testInput : com.google.code.tvrenamer.TVRenamerTest.values) {
        com.google.code.tvrenamer.model.FileEpisode retval = com.google.code.tvrenamer.controller.TVRenamer.parseFilename(testInput.input);
        org.junit.Assert.assertNotNull(retval);
        org.junit.Assert.assertEquals(testInput.input, testInput.show, retval.getShowName());
        org.junit.Assert.assertEquals(testInput.input, java.lang.Integer.parseInt(testInput.season), retval.getSeasonNumber());
        org.junit.Assert.assertEquals(testInput.input, java.lang.Integer.parseInt(testInput.episode), retval.getEpisodeNumber());
    }
}
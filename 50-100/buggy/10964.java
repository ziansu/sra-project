@org.junit.Test
public void testRegexGetsRootWithAccidental() {
    java.lang.String chord = "Bb";
    parser.run(chord);
    junit.framework.Assert.assertEquals("Bb", parser.getRoot());
    java.lang.String otherChord = "F#";
    parser.run(chord);
    junit.framework.Assert.assertEquals("F#", parser.getRoot());
}
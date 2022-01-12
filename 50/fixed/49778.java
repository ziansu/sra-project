@org.junit.Test
public void testChordHandling() throws no.itema.abcconverter.util.AwesomeException {
    java.lang.String aweString = "[^F,/2G,,/2B,,,/2] x/2 | ";
    java.lang.String abcString = "[^F,/2G,,/2B,,,/2]x/2 | ";
    org.junit.Assert.assertEquals(abcString, getABCLineFromAWEString(aweString));
}
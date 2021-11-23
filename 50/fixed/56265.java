@org.junit.Test
public void tesEndPositionDods() {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\.");
    java.lang.String str = "this is a pen...";
    cc.redpen.util.EndOfSentenceDetector detector = new cc.redpen.util.EndOfSentenceDetector(pattern);
    org.junit.Assert.assertEquals(15, detector.getSentenceEndPosition(str, 0));
}
@org.junit.Test
public void testEndPositionWithWhiteWordAndWithoutEndPeriod() {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\.");
    java.lang.String str = "He is Mr. United States";
    java.util.List<java.lang.String> whiteList = cc.redpen.util.EndOfSentenceDetectorTest.generateUmList("Mr.");
    cc.redpen.util.EndOfSentenceDetector detector = new cc.redpen.util.EndOfSentenceDetector(pattern, whiteList);
    org.junit.Assert.assertEquals((-1), detector.getSentenceEndPosition(str));
}
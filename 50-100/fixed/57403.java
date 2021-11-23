@org.junit.Test
public void testEndPositionWithMultipleWhiteWords() {
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\.");
    java.lang.String str = "This Jun. 10th, he was Mr. United States.";
    java.util.List<java.lang.String> whiteList = cc.redpen.util.EndOfSentenceDetectorTest.generateUmList("Mr.", "Jun.");
    cc.redpen.util.EndOfSentenceDetector detector = new cc.redpen.util.EndOfSentenceDetector(pattern, whiteList);
    org.junit.Assert.assertEquals(40, detector.getSentenceEndPosition(str, 0));
}
@org.junit.Test
public void testPreserveSpacesAtFirst() {
    java.lang.String message = "foo\r\n" + (" bar\r\n" + "  baz\r\n");
    java.lang.String result = com.fsck.k9.helper.HtmlConverter.textToHtml(message);
    writeToFile(result);
    junit.framework.Assert.assertEquals(("<pre class=\"k9mail\">" + ((("foo<br />" + " bar<br />") + "  baz<br />") + "</pre>")), result);
}
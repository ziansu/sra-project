@org.junit.Test
public void testPreserveSpacesAtFirstForSpecialCharacters() {
    java.lang.String message = " \r\n" + ((("  &\r\n" + "    \n") + "   <\r\n") + "  > \r\n");
    java.lang.String result = com.fsck.k9.helper.HtmlConverter.textToHtml(message);
    junit.framework.Assert.assertEquals(("<pre class=\"k9mail\">" + (((((((" <br />" + "  &amp;<br />") + "    <br />") + "   &lt;<br />") + "<blockquote class=\"gmail_quote\" style=\"margin: 0pt 0pt 1ex 0.8ex; border-left: 1px solid #729fcf; padding-left: 1ex;\">") + " <br />") + "</blockquote>") + "</pre>")), result);
}
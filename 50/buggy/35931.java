@org.junit.Test
public void testFormatEndOptionalHTML() {
    java.lang.String escapedEndRuleText = "</div>\n";
    assertEquals(escapedEndRuleText, org.spdx.licenseTemplate.HtmlTemplateOutputHandler.formatEndOptionalHTML());
}
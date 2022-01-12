@org.junit.Test
public void parseConfig_timezone_not_specified() throws java.io.IOException {
    java.lang.StringBuilder xml = new java.lang.StringBuilder();
    xml.append("<config>\n");
    xml.append("</config>\n");
    com.enonic.xp.form.inputtype.DateConfig expected = com.enonic.xp.form.inputtype.DateConfig.newDateConfig().build();
    com.enonic.xp.form.inputtype.DateConfig parsed = serializer.parseConfig(com.enonic.xp.form.inputtype.DateConfigXmlSerializerTest.CURRENT_MODULE, com.enonic.xp.xml.DomHelper.parse(xml.toString()));
    junit.framework.Assert.assertEquals(expected.isWithTimezone(), parsed.w());
}
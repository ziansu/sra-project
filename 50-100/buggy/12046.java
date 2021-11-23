@org.junit.Test
public void testUnmarshal() {
    java.lang.String text = ("<converterTest>\n  " + (xmlLine)) + "\n</converterTest>";
    org.zetool.components.property.converter.AbstractConverterTest.DataHolder dh = ((org.zetool.components.property.converter.AbstractConverterTest.DataHolder) (xstream.fromXML(text)));
    org.junit.Assert.assertThat(dh.property, org.hamcrest.CoreMatchers.is(org.zetool.components.property.converter.AbstractConverterTest.equalTo(property)));
}
@org.junit.Test
public void assertProperty() {
    org.zetool.components.property.converter.AbstractConverterTest.DataHolder dh = new org.zetool.components.property.converter.AbstractConverterTest.DataHolder(property);
    java.io.StringWriter sw = new java.io.StringWriter();
    xstream.toXML(dh, sw);
    java.lang.String result = getXml(sw);
    org.junit.Assert.assertThat(result, org.hamcrest.CoreMatchers.is(org.zetool.components.property.converter.AbstractConverterTest.equalTo(java.lang.String.join("\n", xmlLine))));
}
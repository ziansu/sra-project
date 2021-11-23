@org.junit.Test
public void test_constructor_wholeValueIsDouble() throws org.kairosdb.client.builder.DataFormatException {
    org.kairosdb.client.builder.DataPoint dataPoint = new org.kairosdb.client.builder.DataPoint(93939393, 5.0);
    org.junit.Assert.assertThat(dataPoint.longValue(), org.hamcrest.Matchers.equalTo(5L));
    org.junit.Assert.assertThat(dataPoint.getValue(), org.hamcrest.CoreMatchers.instanceOf(java.lang.Double.class));
    org.junit.Assert.assertThat(dataPoint.isIntegerValue(), org.hamcrest.Matchers.equalTo(true));
    org.junit.Assert.assertThat(dataPoint.isDoubleValue(), org.hamcrest.Matchers.equalTo(false));
}
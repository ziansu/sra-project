@org.junit.Test
public void test_constructor_doubleValue() throws org.kairosdb.client.builder.DataFormatException {
    org.kairosdb.client.builder.DataPoint dataPoint = new org.kairosdb.client.builder.DataPoint(93939393, 30.3);
    org.junit.Assert.assertThat(dataPoint.doubleValue(), org.hamcrest.Matchers.equalTo(30.3));
    org.junit.Assert.assertThat(dataPoint.getValue(), instanceOf(java.lang.Double.class));
    org.junit.Assert.assertThat(dataPoint.isIntegerValue(), org.hamcrest.Matchers.equalTo(false));
    org.junit.Assert.assertThat(dataPoint.isDoubleValue(), org.hamcrest.Matchers.equalTo(true));
}
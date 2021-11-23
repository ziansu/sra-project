@org.junit.Test
public void test_constructor_longValue() throws org.kairosdb.client.builder.DataFormatException {
    org.kairosdb.client.builder.DataPoint dataPoint = new org.kairosdb.client.builder.DataPoint(93939393, 30L);
    org.junit.Assert.assertThat(dataPoint.longValue(), org.hamcrest.Matchers.equalTo(30L));
    org.junit.Assert.assertThat(dataPoint.getValue(), instanceOf(java.lang.Long.class));
    org.junit.Assert.assertThat(dataPoint.isIntegerValue(), org.hamcrest.Matchers.equalTo(true));
    org.junit.Assert.assertThat(dataPoint.isDoubleValue(), org.hamcrest.Matchers.equalTo(false));
}
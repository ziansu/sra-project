@org.junit.Test
public void convertsJodaDateTimeCorrectly() {
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithJodaDateTime bean = new org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithJodaDateTime();
    bean.id = DEFAULT_BEAN_ID;
    bean.manufactured = new org.joda.time.DateTime(2013, 6, 18, 6, 0, 0);
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithJodaDateTime loaded = saveAndLoad(bean);
    assertThat(loaded.manufactured, equalTo(bean.manufactured));
}
@org.junit.Test
public void convertsPointCorrectly() {
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithPoint bean = new org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithPoint();
    bean.id = DEFAULT_BEAN_ID;
    bean.location = new org.springframework.data.geo.Point(48.30975, 14.28435);
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithPoint loaded = saveAndLoad(bean);
    assertEquals(bean.location.getX(), loaded.location.getX(), 0.0F);
    assertEquals(bean.location.getY(), loaded.location.getY(), 0.0F);
}
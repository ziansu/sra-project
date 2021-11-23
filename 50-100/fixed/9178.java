@org.junit.Test
public void testProcessesInheritanceCorrectly() {
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithBaseClass bean = new org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithBaseClass();
    bean.id = DEFAULT_BEAN_ID;
    bean.name = "christoph strobl";
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithBaseClass loaded = saveAndLoad(bean);
    assertEquals(bean.id, loaded.id);
    assertEquals(bean.name, loaded.name);
}
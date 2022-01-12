@org.junit.Test
public void testProcessesInheritanceCorrectly() {
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithBaseClass bean = new org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithBaseClass();
    bean.id = DEFAULT_BEAN_ID;
    bean.name = "christoph strobl";
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithBaseClass loaded = saveAndLoad(bean);
    org.junit.Assert.assertEquals(bean.id, loaded.id);
    org.junit.Assert.assertEquals(bean.name, loaded.name);
}
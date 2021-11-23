@org.junit.Test
public void testProcessesListCorrectly() {
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithList bean = new org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithList();
    bean.id = DEFAULT_BEAN_ID;
    bean.categories = java.util.Arrays.asList("spring", "data", "solr");
    org.springframework.data.solr.core.convert.ITestMappingSolrConverter.BeanWithList loaded = saveAndLoad(bean);
    org.junit.Assert.assertThat(loaded.categories, org.hamcrest.core.IsEqual.equalTo(bean.categories));
}
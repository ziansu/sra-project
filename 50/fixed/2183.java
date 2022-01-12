@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void test_EmptySolrUrl() {
    new eu.europeana.publisher.dao.SOLRWriter(new eu.europeana.publisher.domain.DBTargetConfig(null, "\t\t\t\n\r", false, ""));
}
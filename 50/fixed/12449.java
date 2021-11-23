@org.junit.Test
public void update() throws java.io.IOException, org.apache.solr.client.solrj.SolrServerException {
    jackals.job.pojo.JobInfo jobInfo = jackals.simples.TencentNews.job();
    jobManager.update(jobInfo, com.google.common.collect.ImmutableList.of("10"));
}
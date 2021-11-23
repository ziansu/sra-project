@org.junit.Test
public void shouldReturnThroughputEvenIfOneHttpSample() {
    hudson.plugins.performance.HttpSample httpSample1 = new hudson.plugins.performance.HttpSample();
    httpSample1.setDate(new java.util.Date());
    httpSample1.setDuration(1000);
    uriReport.addHttpSample(httpSample1);
    junit.framework.Assert.assertEquals(1, throughputUriReport.get());
}
@org.junit.Test
@com.alterego.stackoverflow.test.rules.Repeat(times = 100)
public void test_if_request_no_rxmethod_is_legal() throws java.lang.Exception {
    com.tspoon.benchit.Benchit.begin("request-call-noRX");
    retrofit2.Call<com.alterego.stackoverflow.test.data.SearchResponse> call = mStackOverflowApiManager.doSearchForTitleAndTagsNormal("", "");
    org.fest.assertions.api.Assertions.assertThat(call.request().method()).isEqualToIgnoringCase("GET");
    org.fest.assertions.api.Assertions.assertThat(call.request().url()).isNotNull();
    com.tspoon.benchit.Benchit.end("request-call-noRX");
}
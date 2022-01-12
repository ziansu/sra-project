@org.junit.Test
public void cacheReadingOfResponse() throws java.lang.Exception {
    com.clouway.chita.HttpResponse response = new com.clouway.chita.HttpResponse(200, "OK", org.apache.commons.io.IOUtils.toInputStream("response body"));
    byte[] bytes1 = response.readBytes();
    byte[] bytes2 = response.readBytes();
    org.junit.Assert.assertThat(bytes1, org.hamcrest.Matchers.is(bytes2));
}
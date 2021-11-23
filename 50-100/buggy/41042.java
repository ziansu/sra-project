@org.junit.Test
public void makePostRequestWithXMLSuccessfullyPostsToValidURL() {
    uk.ac.ox.zoo.seeg.abraid.mp.common.web.WebServiceClient client = new uk.ac.ox.zoo.seeg.abraid.mp.common.web.WebServiceClient();
    java.lang.String xml = "<test><name>Harry Hill</name></test>";
    java.lang.String response = client.makePostRequestWithXML(uk.ac.ox.zoo.seeg.abraid.mp.common.web.WebServiceClientTest.POST_URL, xml);
    org.assertj.core.api.Assertions.assertThat(response).containsIgnoringCase("\"Content-Type\": \"text/xml\"");
    org.assertj.core.api.Assertions.assertThat(response).containsIgnoringCase((("\"data\": \"" + xml) + "\""));
    java.lang.String expectedReportUrl = uk.ac.ox.zoo.seeg.abraid.mp.common.web.WebServiceClientTest.POST_URL.replace("https", "http");
    org.assertj.core.api.Assertions.assertThat(response).containsIgnoringCase((("\"url\": \"" + expectedReportUrl) + "\""));
}
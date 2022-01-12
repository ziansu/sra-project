@org.junit.Test
public void testPutFileToWebDavServer() {
    java.lang.String content = "xxxxxyyyyyyy";
    java.lang.String name = "template.vhd";
    java.lang.String targetUrl = this.adapter.pushFile(new java.io.ByteArrayInputStream(content.getBytes()), name);
    org.springframework.web.client.RestTemplate template = new org.springframework.web.client.RestTemplate();
    java.lang.String retrievedContent = template.getForObject(targetUrl, java.lang.String.class);
    junit.framework.Assert.assertEquals(content, retrievedContent);
    this.adapter.delete(name);
}
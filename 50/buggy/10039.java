@org.junit.Test
public void buildServiceUrl() {
    int documentId = 17;
    java.lang.String expected = (at.fhj.swd13.pse.test.service.DocumentServiceIT.serviceUrl) + (java.lang.Integer.toString(documentId));
    org.junit.Assert.assertEquals(expected, at.fhj.swd13.pse.test.service.DocumentServiceIT.documentService.buildServiceUrl(documentId));
}
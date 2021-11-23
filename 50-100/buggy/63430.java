@org.testng.annotations.Test(expectedExceptions = org.apache.cxf.binding.soap.SoapFault.class, enabled = true)
public void pingRequestWithoutNamespaceShouldThrow() throws java.lang.Throwable {
    se.inera.axel.shs.mime.ShsMessage testMessage = make(a(se.inera.axel.shs.mime.ShsMessage, with(se.inera.axel.shs.mime.ShsMessageMaker.ShsMessageInstantiator.label, a(se.inera.axel.shs.xml.label.ShsLabel, with(se.inera.axel.shs.xml.label.ShsLabelMaker.ShsLabelInstantiator.to, to("0000000000")))), with(se.inera.axel.shs.mime.ShsMessageMaker.ShsMessageInstantiator.dataParts, listOf(pingRequestWithoutNamespace))));
    try {
        template().requestBody("direct:testShs2riv", testMessage);
    } catch (org.apache.camel.CamelExecutionException e) {
        throw e.getCause();
    }
}
@org.testng.annotations.Test(expectedExceptions = org.apache.cxf.binding.soap.SoapFault.class, enabled = true)
public void pingRequestWithInvalidToAddressShouldThrow() throws java.lang.Throwable {
    se.inera.axel.shs.mime.ShsMessage testMessage = make(shsMessageMaker.but(with(se.inera.axel.shs.mime.ShsMessageMaker.ShsMessageInstantiator.label, a(se.inera.axel.shs.xml.label.ShsLabel, with(se.inera.axel.shs.xml.label.ShsLabelMaker.ShsLabelInstantiator.to, to("1111111111"))))));
    try {
        template().requestBody("direct:testShs2riv", testMessage);
    } catch (org.apache.camel.CamelExecutionException e) {
        throw e.getCause();
    }
}
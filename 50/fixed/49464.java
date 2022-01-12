@net.continuumsecurity.proxy.Test
public void testGetXmlReport() throws net.continuumsecurity.proxy.ProxyException {
    java.lang.String report = new java.lang.String(net.continuumsecurity.proxy.ZAProxyScannerTest.zaproxy.getXmlReport());
    assert report.startsWith("<?xml version=\"1.0\"");
    assert report.endsWith("</OWASPZAPReport>");
}
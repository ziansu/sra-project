@org.junit.Test
public void errorInputInfoTest2() {
    analyzer = new nc.sumy.edu.webcontainer.deployment.WebXMLAnalyzer(new java.io.File((((nc.sumy.edu.webcontainer.deployment.WebXMLAnalyzerTest.TEST_PATH) + (java.lang.Integer.toString(3))) + (nc.sumy.edu.webcontainer.deployment.WebXMLAnalyzerTest.WEB_INF))));
    dataMap = analyzer.getDataMap();
    org.junit.Assert.assertEquals(analyzer.isXmlValid(), true);
    org.junit.Assert.assertEquals(dataMap.containsKey(nc.sumy.edu.webcontainer.deployment.WebXMLAnalyzerTest.SERVLET1), true);
    org.junit.Assert.assertEquals(dataMap.containsKey(nc.sumy.edu.webcontainer.deployment.WebXMLAnalyzerTest.SERVLET2), true);
}
@org.junit.Test
public void testAlto2() throws java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
    org.w3c.dom.Document parsed = cz.incad.kramerius.utils.XMLUtils.parseDocument(cz.incad.kramerius.utils.ALTOUtilsTest.class.getResourceAsStream("res/nalto.xml"));
    cz.incad.kramerius.utils.ALTOUtils.AltoDisected disected = cz.incad.kramerius.utils.ALTOUtils.disectAlto("prosa", parsed);
    junit.framework.Assert.assertNotNull(disected.getAltoImageDimension());
    junit.framework.Assert.assertTrue(((disected.getBoxes().size()) > 0));
    java.lang.System.out.println(disected.toJSON());
}
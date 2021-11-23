@org.junit.Test
public void testInlineCountAllpages() throws java.lang.Exception {
    initializeRoomData(20);
    org.apache.olingo.odata2.core.ep.AtomEntityProvider ser = createAtomEntityProvider();
    org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties properties = org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.serviceRoot(org.apache.olingo.odata2.android.xml.BASE_URI).mediaResourceMimeType("mediatype").inlineCount(java.lang.Integer.valueOf(103)).inlineCountType(InlineCount.ALLPAGES).build();
    org.apache.olingo.odata2.api.processor.ODataResponse response = ser.writeFeed(view.getTargetEntitySet(), roomsData, properties);
    java.lang.String xmlString = verifyResponse(response);
    assertXpathExists("/a:feed/m:count", xmlString);
    assertXpathEvaluatesTo("103", "/a:feed/m:count/text()", xmlString);
}
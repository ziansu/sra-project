@org.junit.Test
public void testEntries() throws java.lang.Exception {
    initializeRoomData(103);
    org.apache.olingo.odata2.core.ep.AtomEntityProvider ser = createAtomEntityProvider();
    org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties properties = org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.serviceRoot(org.apache.olingo.odata2.android.xml.BASE_URI).mediaResourceMimeType("mediatype").build();
    org.apache.olingo.odata2.api.processor.ODataResponse response = ser.writeFeed(view.getTargetEntitySet(), roomsData, properties);
    java.lang.String xmlString = verifyResponse(response);
    assertXpathExists("/a:feed/a:entry[1]", xmlString);
    assertXpathExists("/a:feed/a:entry[2]", xmlString);
    assertXpathExists("/a:feed/a:entry[103]", xmlString);
}
@org.junit.Test
public void testInlineCountNone() throws java.lang.Exception {
    org.mockito.Mockito.when(view.getInlineCount()).thenReturn(InlineCount.NONE);
    org.apache.olingo.odata2.core.ep.AtomEntityProvider ser = createAtomEntityProvider();
    org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties properties = org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.serviceRoot(org.apache.olingo.odata2.android.xml.BASE_URI).build();
    org.apache.olingo.odata2.api.processor.ODataResponse response = ser.writeFeed(view.getTargetEntitySet(), roomsData, properties);
    java.lang.String xmlString = verifyResponse(response);
    assertXpathNotExists("/a:feed/m:count", xmlString);
}
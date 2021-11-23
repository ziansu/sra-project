@org.junit.Test(expected = org.apache.olingo.odata2.api.ep.EntityProviderException.class)
public void testInlineCountInvalid() throws java.lang.Exception {
    org.apache.olingo.odata2.core.ep.AtomEntityProvider ser = createAtomEntityProvider();
    org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties properties = org.apache.olingo.odata2.api.ep.EntityProviderWriteProperties.serviceRoot(org.apache.olingo.odata2.android.xml.BASE_URI).inlineCountType(InlineCount.ALLPAGES).build();
    ser.writeFeed(view.getTargetEntitySet(), roomsData, properties);
}
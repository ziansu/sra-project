@org.testng.annotations.Test(expectedExceptions = com.guardtime.ksi.tlv.TLVParserException.class, expectedExceptionsMessageRegExp = "TLV16 should never contain more than 65535 bits of content,.*")
public void testTlvElementChildrenTooLarge_ThrowsTLVParserException() throws java.lang.Exception {
    byte[] content = new byte[(TLVElement.MAX_TLV16_CONTENT_LENGTH) - 1024];
    com.guardtime.ksi.tlv.TLVHeader header = new com.guardtime.ksi.tlv.TLVHeader(true, false, false, 1, TLVElement.MAX_TLV16_CONTENT_LENGTH);
    com.guardtime.ksi.tlv.TLVElement root = new com.guardtime.ksi.tlv.TLVElement(header);
    com.guardtime.ksi.tlv.TLVElement child1 = new com.guardtime.ksi.tlv.TLVElement(header);
    child1.setContent(content);
    com.guardtime.ksi.tlv.TLVElement child2 = new com.guardtime.ksi.tlv.TLVElement(header);
    child1.setContent(content);
    root.addChildElement(child1);
    root.addChildElement(child2);
}
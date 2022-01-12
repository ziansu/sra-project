@org.junit.Test
public void testVCard() {
    com.google.zxing.client.result.AddressBookParsedResultTestCase.doTest("BEGIN:VCARD\r\nADR;HOME:123 Main St\r\nVERSION:2.1\r\nN:Owen;Sean\r\nEND:VCARD", null, new java.lang.String[]{ "Sean Owen" }, null, new java.lang.String[]{ "123 Main St" }, null, null, null, null, null, null, null);
}
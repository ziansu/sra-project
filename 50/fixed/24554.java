@org.junit.Test
public void testAddressBookAU() {
    com.google.zxing.client.result.AddressBookParsedResultTestCase.doTest("MEMORY:foo\r\nNAME1:Sean\r\nTEL1:+12125551212\r\n", null, new java.lang.String[]{ "Sean" }, null, null, null, new java.lang.String[]{ "+12125551212" }, null, null, null, null, "foo");
}
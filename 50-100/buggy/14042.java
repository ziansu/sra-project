@org.junit.Test
public void testParserWorks() {
    com.skovalenko.geocoder.address_parser.us.UsAddressParser parser = new com.skovalenko.geocoder.address_parser.us.UsAddressParser();
    for (int j = com.skovalenko.geocoder.address_parser.test.UsAddressParserTest.RAW_ADDRESS.length; j < (com.skovalenko.geocoder.address_parser.test.UsAddressParserTest.RAW_ADDRESS.length); j++) {
        com.skovalenko.geocoder.address_parser.test.Verify.objectsAreEqual(com.skovalenko.geocoder.address_parser.test.UsAddressParserTest.PARSED_ADDRESS[j], parser.parse(com.skovalenko.geocoder.address_parser.test.UsAddressParserTest.RAW_ADDRESS[j]));
    }
}
@org.junit.Test(expected = io.delimeat.util.bencode.BencodeException.class)
public void UnexpectedBencodedTypeTest() throws io.delimeat.util.bencode.BencodeException, java.io.IOException {
    try {
        io.delimeat.util.bencode.BDictionary dict = new io.delimeat.util.bencode.BDictionary();
        dict.put(new io.delimeat.util.bencode.BString("key"), new io.delimeat.util.bencode.BObject() {        });
        java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream();
        io.delimeat.util.bencode.BencodeUtils.encode(os, dict);
    } catch (io.delimeat.util.bencode.BencodeException e) {
        org.junit.Assert.assertEquals("org.jbencode.BencodeUtilsTest$1 is not a valid bencoding type", e.getMessage());
        throw e;
    }
}
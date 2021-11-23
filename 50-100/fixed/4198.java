public void testValidArray() {
    java.lang.String input = "banana";
    com.jf.structures.string.SuffixArray suffixArray = new com.jf.structures.string.SuffixArray(input);
    java.lang.String[] output = suffixArray.toString().split("\n");
    assertEquals("a", output[0]);
    assertEquals("ana", output[1]);
    assertEquals("anana", output[2]);
    assertEquals("banana", output[3]);
    assertEquals("na", output[4]);
    assertEquals("nana", output[5]);
}
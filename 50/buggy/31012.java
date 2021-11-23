@org.junit.Test
public void compressionSingleCharacter() throws java.lang.Exception {
    java.lang.String content = "A";
    byte[] data = com.seapip.thomas.huffman.Huffman.compress(content);
}
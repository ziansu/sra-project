public void initTree(final java.util.List<com.levigo.jbig2.decoder.huffman.HuffmanTable.Code> codeTable) {
    preprocessCodes(codeTable);
    for (com.levigo.jbig2.decoder.huffman.HuffmanTable.Code c : codeTable) {
        rootNode.append(c);
    }
}
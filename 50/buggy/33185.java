private java.lang.String createClosingTag(java.lang.String tagText) {
    return com.computer.nand2tetris.compiler.io.ParsedXmlWriter.createTag(java.lang.String.format("/%s", tagText));
}
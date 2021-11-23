public static void main(final java.lang.String[] args) {
    final byte[] bytes = ch.usi.dag.disl.classparser.SnippetParser.generateNewProcessing("test", "hasnext", null);
    ch.usi.dag.disl.classparser.SnippetParser.bytesToFile("./", "test.class", bytes, 0, bytes.length);
}